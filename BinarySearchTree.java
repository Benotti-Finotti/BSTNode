package bstnode;

/**
 * @author Benjamin Finotti
 * October 25th, 2018
 * CSCI 333, Dr. Whitley
 * Homework #6 BinarySearchTree
 * 
 * This class is the BinarySearchTree, the "meat" of the program, if you will.
 * Consists of insert which makes the tree as you insert more values. Delete,
 * which will delete the value you specify. And other typical things, maximum,
 * minimum, getSize, successor, predecessor. Finally, the traversals are here as well,
 * inOrder, preOrder, and postOrder.
 */
public class BinarySearchTree {
    
    private BSTNode root;
    private int size;

    public BinarySearchTree(){
        root = null;
        size = 0;
    }
    /**
     * @return the size of the BinarySearchTree.
     */
    public int getSize(){
        return size;
    }
    
    private void transplant(BinarySearchTree t, BSTNode oldRoot, BSTNode newRoot){
        if(oldRoot.getP() == null){
            t.root = newRoot;
        }else if(oldRoot == oldRoot.getP().getLeft()){
           oldRoot.getP().setLeft(newRoot);
        }else{oldRoot.getP().setRight(newRoot);}
        if(newRoot != null){
            newRoot.setP(oldRoot.getP());
        }
        
    }
    /**
     * @return the maximum root value of the BinarySearchTree.
     */
    public BSTNode maximum(){
        return maximum(root);
    }
    
    private BSTNode maximum(BSTNode root){
        while(root.getRight() != null){
            root = root.getRight();
        }
        return root;
    }
     /**
     * @return the minimum root value of the BinarySearchTree.
     */
    public BSTNode minimum(){
        return minimum(root);
    }
    
    private BSTNode minimum(BSTNode root){
        while(root.getLeft() != null){
            root = root.getLeft();
        }
        return root;
    }
    /**
     * @return the appropriate successor of a key that was deleted.
     */
   public BSTNode successor(){
       return successor(this.root);
   }
    
    private BSTNode successor(BSTNode root){
        if(root.getRight() != null){
            return minimum(root.getRight());
        }
        while(root.getP() != null & root == root.getP().getRight()){
            root = root.getP();
        }
        return root.getP();
    }
    /**
     * @return the predecessor of a key that was deleted.
     */
    public BSTNode predecessor(){
        return predecessor(this.root);
    }
    
    private BSTNode predecessor(BSTNode root){
        if(root.getLeft() != null){
            return maximum(root.getLeft());
        }
        while(root.getP() != null & root == root.getP().getLeft()){
            root = root.getP();
        }
        return root.getP();
    }
/**
 * @param key inserts the requested value as a key into the tree.
 */
    public void insert(int key){
        BSTNode n = new BSTNode(key);
        insert(this, n);
    }
    
    private void insert(BinarySearchTree t, BSTNode z){
        BSTNode y = null;
        BSTNode x = t.root;
        while(x != null){
            y = x;
        if(z.getKey() < x.getKey()){
            x = x.getLeft();
        }else{
            x = x.getRight();
        }
    }
        z.setP(y);
        if(y == null){
            t.root = z;
        }else if (z.getKey() < y.getKey()){
            y.setLeft(z);
        }else{
            y.setRight(z);
        }
        size++;
    }
    /**
     * @param key delete the requested key from the tree.
     */
    public void delete(int key){
    delete(this, search(root, key));
    }
    
    private void delete(BinarySearchTree t, BSTNode z){
        BSTNode y;
        if (z.getLeft() == null){
            transplant(t, z, z.getRight());
        }else if(z.getRight() == null){
            transplant(t, z, z.getLeft());
        }else{
            y = minimum(z.getRight());
        if(y.getP() != z){
            transplant(t, z, y);
            y.setRight(z.getRight());
            y.getRight().setP(y);
        }
        transplant(t, z, y);
        y.setLeft(z.getLeft());
        y.getLeft().setP(y);
        }
        size--;
    }
    /**
     * @param key value you want to search for within the tree.
     * @return the address in memory of the key searched for.
     */
    public BSTNode search(int key){
        return search(root, key);
    }
    
    private BSTNode search(BSTNode root, int key){
        if(root == null){
            return null;
        }if(key == root.getKey()){
           return root;
        }if(key < root.getKey()){
            return search(root.getLeft(), key);
        }else{
           return search(root.getRight(), key);
        }
    }
    /**
     * Sorts the tree in a preOrder manner -- i.e. as you first see the number "on the left"
     */
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    
    private void preOrderTraversal(BSTNode n){
        if(n != null){
            System.out.println(n.getKey() + " ");
            preOrderTraversal(n.getLeft());
            preOrderTraversal(n.getRight());
        }
    }
    /**
     * Sorts the tree inOrder -- i.e. ascending order.
     */
   public void inOrderTraversal(){
       inOrderTraversal(root);
   } 
    
    private void inOrderTraversal(BSTNode n){
        if(n != null){
            inOrderTraversal(n.getLeft());
            System.out.println(n.getKey() + " ");
            inOrderTraversal(n.getRight());
        }
    }
   /**
    * Sorts the tree as you pass the value "on the right". 
    */ 
   public void postOrderTraversal(){
       postOrderTraversal(root);
   } 
    
    private void postOrderTraversal(BSTNode n){
        if(n != null){
            postOrderTraversal(n.getLeft());
            postOrderTraversal(n.getRight());
            System.out.println(n.getKey() + " ");
        }
    }
    
}

package bstnode;

/**
 * @author Benjamin Finotti
 * October 25th, 2018
 * CSCI 333, Dr. Whitley
 * Homework #6 BinarySearchTree
 * 
 * This class is a simple collection of getters, setters and private data fields that will
 * be accessed and used in the BinarySearchTree class.
 */
public class BSTNode {

   
    private BSTNode p;
    private BSTNode left;
    private BSTNode right;
    private int key;
    /**
     * @param k is an integer value that represents the key for a given BinaryTree.
     */
    public BSTNode(int k){
        key = k;
        p = null;
        left = null;
        right = null;
    }
    /**
     * @return the parent of a given key/node in a BinarySearchTree.
     */
    public BSTNode getP(){
        return p;
    }
    /**
     * @return the left node of a given key/node in a BinarySearchTree.
     */
    public BSTNode getLeft(){
        return left;
    }
    /**
     * @return the right node of a given key/node in a BinarySearchTree.
     */
    public BSTNode getRight(){
        return right;
    }
    /**
     * @return the key value of a given/node in the tree.
     */
    public int getKey(){
        return key;
    }
    /**
     * @param p setter that assigns this.p to the given p value.
     */
    public void setP(BSTNode p){
       this.p = p;
    }
    /**
     * @param left setter that assigns this.left to the given left value.
     */
    public void setLeft(BSTNode left){
        this.left = left;
    }
    /**
     * @param right setter that assigns this.left to the given left value.
     */
    public void setRight(BSTNode right){
        this.right = right;
    }
    
    
    
}
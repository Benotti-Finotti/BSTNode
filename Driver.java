
package bstnode;

/**
 * @author Benjamin Finotti
 * October 25th, 2018
 * CSCI 333, Dr. Whitley
 * Homework #6 BinarySearchTree
 * 
 * This is the driver where all the testing happens. Twenty inserts, six deletes,
 * getting the size before and after the deletes. And of course, the pre, post, and
 * in order traversals.
 */
public class Driver {
    public static void main(String[] args) {
    BinarySearchTree t = new BinarySearchTree();
    t.insert(33);
    t.insert(8);
    t.insert(10);
    t.insert(19);
    t.insert(18);
    t.insert(14);
    t.insert(1);
    t.insert(11);
    t.insert(12);
    t.insert(26);
    t.insert(13);
    t.insert(17);
    t.insert(6);
    t.insert(3);
    t.insert(5);
    t.insert(24);
    t.insert(31);
    t.insert(15);
    t.insert(22);
    t.insert(2);
    
    
    System.out.println("This is the in-order traversal: ");
    t.inOrderTraversal();
    System.out.println(" ");
    
    System.out.println("This is the pre-order traversal: ");
    t.preOrderTraversal();
    System.out.println(" ");
    
    System.out.println("This is the post-order traversal: ");
    t.postOrderTraversal();
    System.out.println(" ");
    
    System.out.println("This is the current size of the Tree: " + t.getSize());
    System.out.println(" ");
    
    System.out.println("Searching for number 33, found at address: " + t.search(33));
    System.out.println("Searching for number 14, found at address: " + t.search(14));
    System.out.println("Searching for number 1, found at address: " + t.search(1));
    System.out.println("Searching for number 13, found at address: " + t.search(13));
    System.out.println("Searching for number 24, found at address: " + t.search(24));
    System.out.println(" ");
    System.out.println("Searching for number 100, expecting null: " + t.search(100));
    System.out.println("Searching for number 34, expecting null: " + t.search(34));
    System.out.println("Searching for number 0, expecting null: " + t.search(0));
    System.out.println("Searching for number 66, expecting null: " + t.search(66));
    System.out.println("Searching for number 69, expecting null: " + t.search(69));
    System.out.println(" ");
        
    t.delete(33);
    t.delete(1);
    t.delete(26);
    t.delete(17);
    t.delete(31);
    t.delete(6);
    System.out.println("This is the current size of the Tree: " + t.getSize());
    System.out.println(" ");
    
    System.out.println("This is the in-order traversal after 6 elements were deleted: ");
    t.inOrderTraversal();
    
    }    
}

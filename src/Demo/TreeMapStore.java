package Demo;
import java.util.*; 
import java.util.concurrent.*;
public class TreeMapStore {
	  
 // Declaring a TreeMap 
	    static TreeMap<Integer, String> tree_map; 
	  
	    // Function to create TreeMap 
	    static void create() 
	    { 
	        // Creating an empty TreeMap 
	        tree_map 
	            = new TreeMap<Integer, String>(); 
	  
	        System.out.println( 
	            "TreeMap successfully"
	            + " created"); 
	    } 
	  
	    // Function to Insert values in 
	    // the TreeMap 
	    static void insert() 
	    { 
	        // Mapping string values to int keys 
	        tree_map.put(10, "Rohan"); 
	        tree_map.put(15, "Tom"); 
	        tree_map.put(20, "Raj"); 
	        tree_map.put(25, "Rahul"); 
	        tree_map.put(30, "Sam"); 
	  
	        System.out.println( 
	            "\nElements successfully"
	            + " inserted in the TreeMap");
	    } 
	    static void traverse() 
	    { 
	        System.out.println("\nTraversing the TreeMap:"); 
	        for (Map.Entry<Integer, String> e : tree_map.entrySet()) 
	            System.out.println(e.getKey() 
	                               + " "
	                               + e.getValue()); 
	    } 
	    public static void main(String[] args) {
			TreeMapStore.create();
			TreeMapStore.insert();
			TreeMapStore.traverse();;
			
		}
}

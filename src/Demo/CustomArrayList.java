package Demo;
import java.util.ArrayList;
public class CustomArrayList {
	   // custom class which has data type 
	    // class has defined the type of data ArrayList 
	    // size of input 4 
	    int n=4; 
	  
	    // the 2nd custom datatype class 
	    class Data 
	    { 
	        // global variables of the class 
	        int roll; 
	        String name; 
	        int marks; 
	        int id; 
	  
	        // constructor has type of data that is required 
	        Data(int roll, String name, int marks, int id) 
	        { 
	            // initialize the input variable from main 
	            // function to the global variable of the class 
	            this.roll = roll; 
	            this.name = name; 
	            this.marks = marks; 
	            this.id = id; 
	        } 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        // suppose the custom input data 
	        int roll[] = {1, 2, 3, 4}; 
	        String name[] = {"Shubham", "Atul", "Ayush", "Rohan"}; 
	        int marks[] = {100, 99, 93, 94}; 
	        int id[] = {121, 122, 123,124};
	                       
	                       
	  
	        // Create an object of the class 
	        CustomArrayList custom = new CustomArrayList(); 
	  
	        // and call the function to add the values to the arraylist 
	        custom.addValues(roll, name, marks, id); 
	       // custom.removeValues(roll, name, marks, id);
	    } 
	  
	    public void addValues(int roll[], String name[], int marks[], 
	                          int id[]) 
	    { 
	        // local custom arraylist of data type 
	        // Data having (int, String, int, long) type 
	        // from the class 
	        ArrayList<Data> list=new ArrayList<>(); 
	  
	        for (int i = 0; i < n; i++) 
	        { 
	            // create an object and send values to the 
	            // constructor to be saved in the Data class 
	            list.add(new Data(roll[i], name[i], marks[i], 
	                                              id[i])); 
	        } 
	  
	        // after adding values printing the values to test 
	        // the custom arraylist 
	        printValues(list); 
	    } 
	    public void removeValues(int roll[], String name[], int marks[], 
                int id[]) 
{ 
// local custom arraylist of data type 
// Data having (int, String, int, long) type 
// from the class 
ArrayList<Data> list=new ArrayList<>(); 

for (int i = 0; i < n; i++) 
{ 
  // create an object and send values to the 
  // constructor to be saved in the Data class 
  list.remove(new Data(roll[i], name[i], marks[i], 
                                    id[i])); 
} 

// after adding values printing the values to test 
// the custom arraylist 
printValues(list); 
} 
	  
	    public void printValues(ArrayList<Data> list) 
	    { 
	        // list- the custom arraylist is sent from 
	        // previous function 
	  
	        for (int i = 0; i < n; i++) 
	        { 
	            // the data received from arraylist is of Data type 
	            // which is custom (int, String, int, long) 
	            // based on class Data 
	  
	            Data data = list.get(i); 
	  
	            // data variable of type Data has four primitive datatypes 
	            // roll -int 
	            // name- String 
	            // marks- int 
	            // phone- long 
	            System.out.println(data.roll+" "+data.name+" "
	                               +data.marks+" "+data.id); 
	        } 
	    } 
}

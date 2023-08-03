import java.util.ArrayList;

public class GenericArrayLists {
    // learning about ArrayLists today
    public static void main(String[] args) {
        //ArrayList<Employee> staff = new ArrayList<>();
        var staff = new ArrayList<Employee>(); // better way of defining this
        // arraylists are basically dynamically sized arrays
        // we can change the length anytime we want
        // using add method to update staff list
        staff.add(new Employee("Sally",500,1,1,10));
        staff.add(new Employee("Harry",600,2,11,16));
        staff.add(new Employee("Peter",700,3,12,19));
        staff.ensureCapacity(100); //  this method allocates space beforehand for your arraylist, then you do not have to do more reallocatoin after adding more elements
        // note: var staff = new ArrayList<Employee>(100); // we could have also allocated the memory when defining this
        System.out.println(staff); // the toString method for the ArrayList class outputs the list in a nice format
        System.out.println(staff.size()); // equivalent of arr.length for arrays
        // staff.trimToSize(); get rids of all previoulsy allocated memory
        // note: only use above method when you know you won't add more elements
        System.out.println(staff.get(0)); // getting 0th index
        staff.set(0, new Employee("Manu",3421412,1,3,5,new StringBuilder("Why are we paying him so much?!"))); // setting the 0th index to something else
        System.out.println(staff.get(0));
        // how to copy ArrayList elements to an array
        var arr = new Employee[staff.size()];
        staff.toArray(arr); // can be its own independent method

        staff.remove(2); // can remove elements
        System.out.println(staff);

    }
}

package Coding.Training;

public class Main {

    public static void main(String[] args) {
        List linkedList = new List();

        System.out.print("Initial list: length = ");
        linkedList.length();
        System.out.println();

        // Insert some numbers into the list
        for(int i = 0; i < 8; i++){
            linkedList.insert(i, (int)(Math.random()*100));
        }
        System.out.print("Set a list: ");
        linkedList.print();
        System.out.println();

        // Implement get function
        System.out.print("Get an item with index 6 from list: ");
        linkedList.get(6);
        linkedList.print();
        System.out.println();

        // Implement add function
        System.out.print("Add an item into list: ");
        linkedList.add(15);
        linkedList.print();
        System.out.println();

        // Implement remove function
        System.out.print("Remove an item with index 4 from list: ");
        linkedList.remove(4);
        linkedList.print();
        System.out.println();

        // Get length of the list
        System.out.print("The length of list: ");
        linkedList.length();



    }
}

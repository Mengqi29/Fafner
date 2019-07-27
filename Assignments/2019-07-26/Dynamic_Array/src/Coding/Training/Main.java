package Coding.Training;

public class Main {

    public static void main(String[] args) {

        Vector_Array test = new Vector_Array();

        System.out.print("Set a new array: ");
        for (int i = 0; i < 8; i++) {
            test.insert(i,i);
        }
        test.print();

        System.out.print("Add a new number: ");
        test.add(11);
        test.print();

        System.out.print("Remove the number of index 3 from array: ");
        test.remove(3);
        test.print();

        Vector_Array b = new Vector_Array();
        System.out.print("Set a b array: ");
        for (int i = 0; i < 5; i++) {
            b.insert(i + 20,i);
        }
        b.print();

        System.out.print("Get the concat array: ");
        test.concat(b);
        test.print();




	// write your code here
    }
}

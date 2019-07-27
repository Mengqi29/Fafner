package Coding.Training;

import java.lang.reflect.Array;

public interface Vetor {

    /*
    *
    * add(int num): insert num at the end of the array. Efficiency: O(1)
    * remove(int index): remove the element at index. Efficiency: O(n)
    * insert(int num, int index): insert num at index. Efficiency: O(n)
    * getSize(): return the length(size) of the array. Efficiency: O(1)
    * concat(Array b): return a new array containing elements in the current array and then the elements in the array b, like [a1, a2, a3, b1, b2, b3]; Efficiency: O(n)
    *
    * */

    public void add(int num);
    public int remove(int index) throws ExceptionBoundaryViolation;
    public int insert(int num, int index) throws ExceptionBoundaryViolation;
    public int getSize();
    public int[] concat(Vector_Array b);

    public void print();
    public int get(int index);

}

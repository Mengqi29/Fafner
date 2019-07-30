package Coding.Training;

public class Vector_Array implements Vetor {
    private int N = 10;
    private int[] A;
    private int n = 0;

    public Vector_Array() {
        A = new int[N];
        this.n = n;
    }

    @Override
    public void add(int num) {
        A[n] = num;
        n++;
    }

    @Override
    public int get(int index) {
        int getValue = A[index];
        return getValue;
    }

    @Override
    public int insert(int num, int index) throws ExceptionBoundaryViolation {
        if (0 > index || index > n) {
            throw new ExceptionBoundaryViolation("Exception: Rank is out of bounds");
        } else if (N <= n) {
            N *= 2;
            int B[] = new int[N]; // Expand double volume of original array
            for (int i = 0; i < n; i++) { // Save the old array to new one
                B[i] = A[i];
                A = B;
            }
        }
        for (int i = n; i > index; i--) {
            A[i] = A[i - 1];
        }
        A[index] = num;
        n++;

        return num;
    }

    @Override
    public int remove(int index) throws ExceptionBoundaryViolation {
        if (0 > index || index >= n) throw new ExceptionBoundaryViolation("Exception: Rank is out of bounds");
        int bak = A[index];
        for (int i = index; i < n - 1; i++) {
            A[i] = A[i + 1];
        }
        n--;

        return bak;
    }

    @Override
    public int getSize() {
        return n;
    }

    @Override
    public int[] concat(Vector_Array b) {
        int nNew = n + b.getSize(); // new rank of concat array

        if (N <= n + nNew) {
            N = (n + nNew) * 2; // Expand volume of new array
            int C[] = new int[N];
            for (int i = 0; i < n; i++) {
                C[i] = A[i];
            }
            A = C;
        }
        int j = 0;
        for (int i = n; i < nNew; i++) {
            A[i] = b.get(j);
            j++;
        }
        n += b.getSize();

        return A;
    }

    @Override
    public void print() {
        if (n == 0) System.out.println("There is no element in the array.");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

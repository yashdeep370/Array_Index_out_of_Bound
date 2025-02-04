import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        try {
            System.out.println("Accessing the index " + size + ": " + arr[size]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException:" + size);
        }
    }
}

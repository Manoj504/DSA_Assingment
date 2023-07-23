import java.util.*;
public class CumMulofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements to array: ");
        for(int i=0;i<n;i++) 
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println("Product array is: ");
        try{
        for(int i=1;i<arr.length;i++) {
            arr[i] = arr[i-1]*arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    } catch(Exception e) {
        System.out.println("Error: "+e.getMessage());
    }
    }

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int sum=0,flag=0;
        for(int i=0;i<arr.length;sum=0,i++) { 
            for ( int j=i;j<arr.length;j++) {
                sum+=arr[j];
                if(sum<0) flag++;
            }
        }
        System.out.println(flag);
    }
}

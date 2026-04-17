package Array2D;

import java.util.Scanner;

public class InputOutput2DAndSearchAndLargestOrsmallest {
//do more question like print largest smallest and print 1 rows and 3 column like this.

    public  static  boolean search(int number[][],int key){
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number[0].length;j++){
                if(number[i][j]==key){
                    System.out.println("found at index["+i+","+j+"]");
                    return true;
                }
            }
        }
        System.out.println("key not exits");
        return false;
    }
    public static void main(String[] args) {
        int number[][]=new int[3][3];
       int n= number.length;
       int m=number[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        //input
       for(int i=0;i<n;i++) {
           for (int j = 0; j < m; j++) {
               number[i][j] = sc.nextInt();
           }
       }
        //output
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   System.out.print(number[i][j]);
               }
               System.out.println( );
       }
           int key=5;
           search(number,key);
    }
}

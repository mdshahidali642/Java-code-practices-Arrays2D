package Array2D;

import java.util.Scanner;

public class Transform2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of rows and column");
        int n=sc.nextInt();
        int m=sc.nextInt();

        //create an array a and t
        int a[][]=new int[n][m];
        //create a t array  stat the column and rows into j and i
        int t[][]=new int[m][n];

        System.out.println("enter the  rows and column");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // transport the a array into t  array form
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    t[j][i]=a[i][j];
                }
            }
          // print the transform array
        System.out.println("transport rows into column and column into rows");
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 System.out.print(t[i][j]);
             }
             System.out.println( );
         }

    }
}

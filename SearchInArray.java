package Array2D;

public class SearchInArray {
    public static boolean search(int number[][],int key){
         int row=0;int col= number[0].length-1;
         while(row< number.length&& col>=0){
             if(number[row][col]==key){
                 System.out.println("key found at ("+row+ ","+col+")");
                 return  true;
             }
             else if(key<number[row][col]){
                 col--;
             }
             else {
                 row++;
             }
         }
        System.out.println("key not found");
         return false;
    }
    public static void main(String[] args) {
        int number[][]={{10,20,30,40},
                         {15,25,35,45},
                             {27,29,37,48}
                                ,{32,33,39,50}};
        int key=37;
        search(number,key);
    }
}

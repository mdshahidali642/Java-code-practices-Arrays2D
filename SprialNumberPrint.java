package Array2D;

public class SprialNumberPrint {
    public static void spiral(int number[][]){
        int statrow=0;
        int statcol=0;
        int endrow= number.length-1;
        int endcol=number[0].length-1;
        while(statrow<=endrow &&statcol<=endcol) {
            //top
            for (int j = statcol; j <= endcol; j++) {
                System.out.print(number[statrow][j] + " ");
            }
            //right
            for (int i = statrow + 1; i <= endrow; i++) {
                System.out.print(number[i][endcol] + " ");
            }

            //bottom
            for (int j = endcol - 1; j >= statcol; j--) {
                if (statrow == endrow) {
                    break;
                }
                System.out.print(number[endrow][j] + " ");
            }
            //left
            for (int i = endrow - 1; i >= statrow + 1; i--) {
                if (statcol == endcol) {
                    break;
                }
                System.out.print(number[i][statcol] + " ");
            }
            statrow++;
            statcol++;
            endcol--;

        }
        System.out.println();
    }

      public static void diagonalsum(int number[][]){
        int sum=0;
//        for(int i=0;i<number.length;i++){
//            for(int j=0;j<number[0].length;j++){
//                if(i==j){
//                  sum+=number[i][j];
//                } else if(i+j==number.length-1){
//                    sum+=number[i][j];
//
//                }
//            }
//        }
//          System.out.println(sum);

        for(int i=0;i<number.length;i++){
            //pd
            sum+=number[i][i];
            //sd
            if(i!=number.length-1-i){
                sum+=number[i][number.length-i-1];
            }

        }
          System.out.println(sum);
      }
    public static void main(String[] args) {
        int number[][]={{1,2,3,4},
                     {5,6,7,8},
                    {9,10,11,12}
                    ,{13,14,15,16}};
          spiral(number);
          diagonalsum(number);

    }
}

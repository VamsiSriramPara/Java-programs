import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Twod {
    public static void main(String[] args) {
       /*
        1 2 3
        4 5 6
        7 8 9
        */
      // int[][] arr=new int[3][]
      Scanner in=new Scanner(System.in);
    //    int [][] arr={
    //     {1,2,3},
    //     {4,5},
    //     {6,7}
    //    };
       //input
       int[][] arr=new int[3][3];
       System.out.println();
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
arr[row][col]=in.nextInt();

        }
        System.out.println(Arrays.toString(arr[row]));
       }

    }
}

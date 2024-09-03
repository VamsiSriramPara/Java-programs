import java.util.Arrays;

public class Lin2d {
    public static void main(String[] args) {
        int[][] arr={
            {2,4,6},
            {7,9,11},
            {43,56,76},
        };
        int tar=76;
        int[] ans=search(arr,tar);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
                return new int[] {i,j};
            }
        }
       }
        return new int[] {};

    }
}

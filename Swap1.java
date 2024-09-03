import java.util.Arrays;

public class Swap1 {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        // swap(arr, 1,4);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int index1, int index4){
         int temp=arr[index1];
         arr[index1]=arr[index4];
         arr[index4]=temp;
         
    }
}

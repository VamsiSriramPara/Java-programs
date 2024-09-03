import java.util.Scanner;
public class Lin {
    public static void main(String[] args) {
        int[] a={22,34,55,1,2,3,4,5,6,99,-1,-3,45,68};
        Scanner in = new Scanner(System.in);
        int target=in.nextInt();
        boolean ans=linearsearch(a,target);
        System.out.println(ans);
    }
    static boolean linearsearch(int[] arr, int target){
        if (arr.length==0){
            return false;
        }
        for (int i=0;i<arr.length;i++){
            int ele=arr[i];
            if (ele==target){
                return true;
            }
        }
        return false;
    }
    
}

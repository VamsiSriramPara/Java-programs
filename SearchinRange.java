import java.util.Scanner;
public class SearchinRange {
    public static void main(String[] args) {
        int[] a={22,34,55,1,2,3,4,5,6,99,-1,-3,45,68};
        // Scanner in = new Scanner(System.in);
        int target=68;
        boolean ans=linearsearch(a,target,1,7);
        System.out.println(ans);
    }
    static boolean linearsearch(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return false;
        }
        for (int i=start;i<end;i++){
            int ele=arr[i];
            if (ele==target){
                return true;
            }
        }
        return false;
    }
    
}

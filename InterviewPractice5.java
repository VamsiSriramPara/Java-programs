// find peak in mountain array
public class InterviewPractice5 {
    public static void main(String[] args) {
        int[] a={1,2,1,3,5,6,4};
        System.out.println(peak(a));
    }
    static int peak(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(a[mid]>a[mid+1]){
              end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;   //we can return either start/end due to pointer points only one number in an array at the end.

    }
}

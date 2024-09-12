import java.util.Arrays;

public class InterviewPractice3 {
    public static void main(String[] args) {
    int[] a={5,7,7,8,8,10};
    int tar=8;
    System.out.println(Arrays.toString(searchRange(a,tar)));
        
    }
    static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        // Check for the occurrence if target first
        int start=firstIndex(nums,target,true);
        int end=firstIndex(nums,target,false);
        ans[0]=start;
        ans[1]=end;
       return ans;
}
    // This fun returns the index value of the target
        static int firstIndex(int[] a,int tar,boolean firstindex){
          int ans=-1; 
          int start=0;
          int end=a.length-1;
          while(start<=end){
              int mid=start+(end-start)/2;
           if(tar<a[mid]){
              end=mid-1;
      }
      else if(tar>a[mid])
      {
          start=mid+1;
      }
      else {
          ans=mid;
          if(firstindex){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
      }
  }
  return ans;
            
        } 
}
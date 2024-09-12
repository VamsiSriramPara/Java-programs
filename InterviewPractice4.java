public class InterviewPractice4 {
    public static void main(String[] args) {
        int a[]={1,3,4,5,7,8,9,11,12,13,14,19,20,21,22,25,29,30,33,40};
        int tar=25;
        System.out.println(ans(a,tar));
    }
    static int ans(int[] a,int tar){
        int start=0;
        int end=1;
        while(tar>a[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return infinity(a,tar,start,end);
    }
    static int infinity(int a[],int tar,int start,int end){
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
        return mid;
        }

    }
    return -1;
}
}

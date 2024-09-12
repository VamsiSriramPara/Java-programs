public class InterviewPractice {
    public static void main(String[] args) {
        int[] a={3,5,6,7,11,23,24,26,98};
        int tar=2;
        System.out.println(floor(a,tar));
  }

//   Ceiling

    static int ceiling(int[] a,int tar){
        if(tar>a[a.length-1]){        //Target is large element in array
         return -1;
        }
     int start=0;
     int end=a.length-1;
     while(start<=end)
       {
        // int mid=(start+end)/2 //might be possible exceeds the range of java(int)
       int mid=start+(end-start)/2;
       if(a[mid]==tar){
        return mid;
       } 
      else if(tar>a[mid]){
        start=mid+1;
       } 
       else if (tar<a[mid]){
        end=mid-1;
       }
    }
    return a[start];

    }

    //Floor

    static int floor(int[] a,int tar){
     int start=0;
     int end=a.length-1;
     if(tar<a[start]){
        return -1;
     }
     while(start<=end)
       {
        // int mid=(start+end)/2 //might be possible exceeds the range of java(int)
       int mid=start+(end-start)/2;
       if(a[mid]==tar){
        return mid;
       } 
      else if(tar>a[mid]){
        start=mid+1;
       } 
       else if (tar<a[mid]){
        end=mid-1;
       }
    }
    return a[end];

    }
}

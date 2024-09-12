//Rotatted binary search  //This will not work for dublicate values
public class InterviewPractice7 {
    public static void main(String[] args) {
      int[] a={4,5,5,6,7,0,1,2,3};
      int tar=5;
      System.out.println(search(a,tar));  
    }
        static int search(int[] arr,int tar){ //Step3
            int pivo=pivot(arr);
            if(pivo==-1){
                return binarysearch(arr,tar,0,arr.length-1);
            }
            if(arr[pivo]==tar){
                return pivo;
            }
            if(tar>arr[0]){
             return binarysearch(arr,tar,0,pivo-1);
            }
            return binarysearch(arr,tar,pivo+1,arr.length-1);
        }
        static int binarysearch(int[] a,int tar,int start,int end){  //Step2
            
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
           return -1;
       
           }

    static int pivot(int[] a){       //Step1
        int start=0;
        int end=a.length-1;
        int mid=start+(end-start)/2;
        //4 Cases over here
        if(mid<end && a[mid]>a[mid+1]){
        return mid;
        }
        if(mid>start&&a[mid]<a[mid-1]){
            return mid-1;
            }
            if(a[mid]<=a[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        return -1;
    }
}

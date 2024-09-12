// public class InterviewPractice6 {
//     int search(int a,int tar){
//         int pea=peak(a);
//         int firstTry=search(a,tar,0,pea); 
//     }
//    static int peak(int[] a){
//     int start=0;
//     int end=a.length-1;
//     while(start<end){
//         int mid=start+(end-start)/2;
//         if(a[mid]>a[mid+1]){
//             end=mid;
//         }
//         else{
//             start=mid+1;
//         }
//     }
//     return start;

//    }
//    static int search(int[] a,int tar,int start,int end){
//  boolean isAsc=a[start]<a[end];
//         while(start<=end)
//           {
//            // int mid=(start+end)/2 //might be possible exceeds the range of java(int)
//           int mid=start+(end-start)/2;
//           if(a[mid]==tar){
//            return mid;
//           } 
//           if(isAsc){
//             if(tar>a[mid]){
//                 start=mid+1;
//                } 
//                else if(tar<a[mid]){
//                 end=mid-1;
//                }
//         }
//         else{
//             if(tar>a[mid]){
//                 end=mid-1;
//                } 
//                else if (tar<a[mid]){
//                 start=mid+1;
//                }
//         }
//        }
//        return -1;
   
//        }
//     }


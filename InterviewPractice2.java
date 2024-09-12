public class InterviewPractice2 {
    public static void main(String[] args) {
        char[] a={'c','f','j'};
        char tar='d';
        System.out.println(greater(a,tar));

    }
    static char greater(char[] a, char tar){
         int start=0;
        int end=a.length-1;
        while(start>=end){
            int mid=start+(end-start)/2;
         if(tar<a[mid]){
            end=mid-1;
         }
         else{
            start=mid+1;
         }
        }
      return a[start%a.length];
    }
}

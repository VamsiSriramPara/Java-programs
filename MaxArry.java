public class MaxArry {
    public static void main(String[] args) {
        int[] arr={1,3,7,5,4,10};
        int temp=arr[0];
        for(int i=1;i<4;i++){
            
            if(arr[i]>temp){
            temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}

public class Minnum {
    public static void main(String[] args) {
       int[] arr={2,5,-99,66,29,4};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[0]){
                ans=arr[i];
                
            }
        }
        return ans;
    }
    
}

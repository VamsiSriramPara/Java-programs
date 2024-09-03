public class EvenDigit {
    public static void main(String[] args) {
        int[][] arr={ {1,3,5},
        {4,6,8},
        {5,7,87}};
        System.out.println(maximumWealth(arr));
       
       } 
       
       public static int maximumWealth(int[][] acc){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<acc.length;i++){
            int sum=0;
            for(int j=0;j<acc[i].length;j++){
             sum=sum+acc[i][j];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
       }
    
      
}


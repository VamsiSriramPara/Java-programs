public class Pattern2 {
    public static void main(String[] args) {
      pattern5(4);
       
    }
    static void pattern1(int n){
        
        for(int i=0;i<=2*n;i++){
            int totalColInRow=i>n?2*n-i:i;
            for(int j=0;j<totalColInRow;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern(int n){
for(int i=0;i<=n;i++){
    for(int j=0;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}
    }
    static void pattern2(int n){
        for(int i=0;i<2*n;i++){
            int totColInRow=i>n?2*n-i:i;
            int space=n-totColInRow;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int j=0;j<totColInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=0;i<n;i++){
         int space=n-i;
         for(int s=0;s<space;s++){
            System.out.print(" ");
         }
         for(int j=0;j<i;j++){
            System.out.print("*");
         }
         System.out.println();
        }
    }
    static void pattern4(int n){
      for(int i=1;i<n;i++){
        for(int s=1;s<n-i;s++){
            System.out.print("  ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j + " ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(j + " ");
      }
      System.out.println();
    }
}
static void pattern5(int n){
    int original=n;
    n=n*2;
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            int atEvery=original-Math.min(Math.min(i,j),Math.min(n-i,n-j));
            System.out.print(atEvery + " ");
        }
        System.out.println();
    }
}

}




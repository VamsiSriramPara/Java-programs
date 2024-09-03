import java.util.Scanner;
public class Func
 {
    public static void main(String[] args) {
       
       
        fun();
        int ans=fun2();
       System.out.println(ans); 
    }
    static int fun2(){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
       int sum=a+b;
       return sum;   
    }
    static void fun(){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
       int sum=a+b;
       
    }
}

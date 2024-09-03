import java.util.Scanner;
public class Arg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
String name=in.next();
        String msg=myGreet(name);
        System.out.println(msg);
    }
    static String myGreet(String greet){
        String a="hello " + greet;
        return a;
    }
}

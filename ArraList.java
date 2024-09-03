import java.util.ArrayList;
import java.util.Scanner;

public class ArraList {
    public static void main(String[] args) {
        //Syntax
        //ArrayList<Integer> list = new ArrayList<>();
        Scanner in=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
for(int i=0;i<5;i++){
    list.add(in.nextInt());
}
    System.out.println(list);
    }

}

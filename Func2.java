import java.util.Arrays;

public class Func2 {
   public static void main(String[] args) {
    String[] v={"Vamsi","vada","pav","hawda"};
    fun(v);
    System.out.println(Arrays.toString(v));
   }
   static void fun(String[] str){
    str[0]="aas0";
    str[1]="ndnjd";
   }
}

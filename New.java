import java.util.Arrays;
import java.util.Scanner;
class New{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] str=new String[4];
        for(int i=0;i<4;i++){
            str[i]=in.next();
            
        }
        
        str[1]="kunal";
        System.out.println(Arrays.toString(str));
    }
}
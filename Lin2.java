import java.util.Arrays;

public class Lin2 {
    public static void main(String[] args) {
       String n="Vamsi";
       char t='i';
       boolean ans = search2(n,t);
       System.out.println(ans);
       System.out.println(Arrays.toString(n.toCharArray()));  
    }
    static boolean search(String str, char tar){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
         if(tar==str.charAt(i)){
            return true;
         }
        }
        return false;
    }
    static boolean search2(String str, char tar){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch==tar){
                return true;
            }
        }
        return false;
    }
}

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        Strings(str);
    }
    public static void Strings(String str){
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr=revstr+str.charAt(i);
        }
        if(str.equals(revstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not an Palindrome");
        }
    }
}
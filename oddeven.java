import java.util.*;
public class oddeven {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str=String.valueOf(a);
        if(str.charAt(str.length()-1)=='1' || str.charAt(str.length()-1)=='3' || str.charAt(str.length()-1)=='5' || str.charAt(str.length()-1)=='7' || str.charAt(str.length()-1)=='9'){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
        }
    }

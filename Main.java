import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(x);
        int[] a = new int[x];
        for(int i=0; i<x; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<x; i++){
        System.out.println(a[i]);}
    }}

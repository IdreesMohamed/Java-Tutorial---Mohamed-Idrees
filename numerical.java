import java.util.*;

public class numerical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String co = sc.nextLine();
        charnum(co);
        System.out.print("Enter the string:");
        String ca = sc.nextLine();
        charup(ca);

    }

    public static void charnum(String co) {
        int n = 0;
        int l = 0;
        int s = 0;
        for (int i = 0; i < co.length(); i++) {
            char ch = co.charAt(i);
            if (Character.isLetter(ch)) {
                l++;
            } else if (Character.isDigit(ch)) {
                n++;
            } else {
                s++;
            }
        }
        System.out.println("number:" + n);
        System.out.println("letter:" + l);
        System.out.println("Symbols:" + s);
    }

    public static void charup(String ca) {
        System.out.println("Uppercase letters:" + ca.toUpperCase());
        System.out.println("Lowercase letters:" + ca.toLowerCase());
    }
}
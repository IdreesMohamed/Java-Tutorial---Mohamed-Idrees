class out{
    int x=10;
    class in{
        int y=5;
    }
}

public class innerClass {
    public static void main(String[] args) {
    out a=new out();
    out.in b=a.new in();
    System.out.println(a.x+b.y);
}}

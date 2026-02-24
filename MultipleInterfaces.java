interface ji{
    public void hi();
}
interface vi{
    public void bye();
}

class Nil implements ji,vi{
    public void hi(){
        System.out.println("Hi");
    }
    public void bye(){
        System.out.println("Bye");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        Nil a = new Nil();
        a.hi();
        a.bye();
}}

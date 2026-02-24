interface j{
    public void hi();
    public void bye();
}

class Ni implements j{
    public void hi(){
        System.out.println("Hi");
    }
    public void bye(){
        System.out.println("Bye");
    }
}


public class singleInterface {
    public static void main(String[] args) {
        Ni a = new Ni();
        a.hi();
        a.bye();
    }
}

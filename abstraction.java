abstract class Ate{
    public abstract void showed();
    public void retor(){
        System.out.println("Hi!");
    }
}

class Bi extends Ate
{
    public void showed(){
        System.out.println("Yeah!!");
    }
}

public class abstraction {
    public static void main(String[] args){
        Bi b=new Bi();
        b.retor();
        b.showed();
    }
}

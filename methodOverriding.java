class A{
    public void show(){
        System.out.println("hi");
    }
}


class B extends A{
    public void show(){
        System.out.println("Hello");
    }
}



public class methodOverriding {
    public static void main(String[] args) {
    A a=new A();
    B b=new B();
    a.show();
    b.show();
}}

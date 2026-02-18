class Animal{
    public void sound(){
        System.out.println("Sound");
    }
}


class Dog extends Animal{
    public void sound(){
        super.sound();
        System.out.println("woof woof");
    }
}


public class superKeyword {
    public static void main(String[] args){
    Dog d=new Dog();
    d.sound();
}}

class en{
    private int age;

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
public class encpasulation {
    public static void main(String[] args) {
        en obj = new en();
        obj.setAge(20);
        System.out.println(obj.getAge());
    }
}

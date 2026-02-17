public class thisConstructor {
    int year;
    String model;
    public thisConstructor(String model){
        this(2000,model);
    }
    public thisConstructor(int year,String model){
        this.year=year;
        this.model=model;
    }
    public void print(){
        System.out.println(year+" "+model);
    }
    public static void main(String[] args) {
        thisConstructor x=new thisConstructor("Porsche");
        thisConstructor y=new thisConstructor(2007,"GTR35");
        x.print();
        y.print();
    }
}

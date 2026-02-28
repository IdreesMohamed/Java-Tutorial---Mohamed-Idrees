import java.io.FileOutputStream;
import java.io.IOException;
public class fileOutputStream {
    public static void main(String[] args) {
        try(FileOutputStream f=new FileOutputStream("file.txt")){
            String s="Yeahhhhh!";
            f.write(s.getBytes());
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}

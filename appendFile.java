import java.io.FileWriter;
import java.io.IOException;
public class appendFile {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("File.txt",true);
            f.write("I'm Idrees");
            f.close();
            System.out.println("Executed");
        } catch (IOException e) {
            System.out.println("Error Occured");
        }
    }
}

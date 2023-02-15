
package Tasks;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class A {
    public static void main(String[]args) throws FileNotFoundException, IOException{ 
    File a = new File("C:\\javaap\\test.txt");
        try (//    System.out.println(a.getAbsolutePath());
                FileOutputStream y = new FileOutputStream(a)) {
            y.write(99);
            y.write(97);
            y.write(98);
            y.close();
            
            FileInputStream x = new FileInputStream(a);
            
            System.out.println(x.read());
            System.out.println(x.read());
            System.out.println(x.read());
            System.out.println(x.read());
             
            
        }
}}

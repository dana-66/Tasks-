
package Tasks;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class TASK_2_part2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int wordCount = 0;
        try{    
            reader = new BufferedReader(new FileReader("C:\\javaTask\\IDK.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {        
                String[] words = currentLine.split(" ");
                if(words.length < 2) {   
                } else {
                    wordCount = wordCount + words.length;
                }
                currentLine = reader.readLine();
            } 
            System.out.println("Number Of Words In A File : "+wordCount);
       }
        catch (IOException e) 
        {
        }
                reader.close();           
    
    }   
}
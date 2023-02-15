
package Tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_2_partB {
    public static void main(String[]args) throws FileNotFoundException, IOException{
     
        String line;  
        int count = 0;  
          
        //Opens a file in read mode  
        FileReader file = new FileReader("C:\\javaTask\\IDK.txt");  
        BufferedReader br = new BufferedReader(file);  
              
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length; 
        } 
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
} 
//
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Task_2_partB 
//{
//   public static void main(String[] args) throws FileNotFoundException ,IOException
//   {
//      File f1=new File("C:\\javaTask\\IDK.txt"); //Creation of File Descriptor for input file
//      String[] words=null;    //Intialize the word Array
//      int wcount=0;     //Intialize word count to zero
//       try (FileReader fr = new FileReader(f1) //Creation of File Reader object
//       ) {
//           BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
//           String s;
//           while((s=br.readLine())!=null)    //Reading Content from the file
//           {
//               words=s.split(" ");   //Split the word using space
//               wcount = wcount + words.length;   //increase the word count for each word
//           }} //Creation of BufferedReader object
//      System.out.println("Number of words in the file:" +wcount);    //Print the word count
//   }}
//}//{
//   public static void main(String[] args) throws FileNotFoundException ,IOException
//   {
//      File f1=new File("C:\\javaTask\\IDK.txt"); //Creation of File Descriptor for input file
//      String[] words=null;    //Intialize the word Array
//      int wcount=0;     //Intialize word count to zero
//       try (FileReader fr = new FileReader(f1) //Creation of File Reader object
//       ) {
//           BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
//           String s;
//           while((s=br.readLine())!=null)    //Reading Content from the file
//           {
//               words=s.split(" ");   //Split the word using space
//               wcount = wcount + words.length;   //increase the word count for each word
//           }} //Creation of BufferedReader object
//      System.out.println("Number of words in the file:" +wcount);    //Print the word count
//   }
//}
////
////{ private static final String FILE_PATH = "C:\\javaTask\\IDK.txt";
////   public static void main(String args[]) throws IOException {
////      FileUtil fileUtil = new FileUtil(FILE_PATH);
////      System.out.println("No. of words in file: " + fileUtil.getWordCount());
////   }
////}
////
////class FileUtil {
////   static BufferedReader reader = null;
////   public FileUtil(String filePath) throws FileNotFoundException {
////      File file = new File(filePath);
////      FileInputStream fileStream = new FileInputStream(file);
////      InputStreamReader input = new InputStreamReader(fileStream);
////      reader = new BufferedReader(input);
////   }
////
////   public static int getWordCount() throws IOException {
////      int wordCount = 0;
//      String data;
//      while((data = reader.readLine()) != null){
//
//         // \\s+ regex for space delimiter
//         String[] words = data.split("\\s+");
//         wordCount += words.length;
//      }
//      return wordCount;
//   }
//}

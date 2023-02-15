package Tasks;
import java.util.Scanner;
import java.io.*;
public class Task_2{
    public static void main (String[]args){
        int numOfWords = 0;
        try{
        File myFile = new File("C:\\javaTask\\IDK.txt");
        Scanner file = new Scanner(myFile);  
        
        while(file.hasNextLine()){
            
            String cline = file.nextLine();
            int size = cline.length();
            boolean foundDiv = true;
            boolean foundChar = false;
            
            for(int i =0; i<size;i++){
                if(!cline.charAt(i==' ')){
                } else {
                    foundDiv = true;
                    foundChar = false;
                }
                if (foundChar && foundDiv){
                    numOfWords++;
                    foundDiv = false ;   
                }
            
        
        file.close();
        System.out.println("the number of words is = "+numOfWords);
        }}
        }catch(FileNotFoundException e){ 
            System.out.println("your are an idiot");
        }

}}

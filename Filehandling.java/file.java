
import java.util.*;
import java.io.*;
import java.nio.file.*;
// public class file {
//     public static void main(String[] args){
// try{
//     // File f=new File("training.txt");
//     File f=new File("");
//     if(f.createNewFile()){
//         System.out.println("file created:");
//     }
//     else{
//          System.out.println("file already exists");
//     }
// }catch(Exception e){
//     System.out.println(e);
// }
//     }
public class file {
    public static void main(String[] args){
        try(FileWriter f=new FileWriter("training.txt")){
            f.write("Chicken Dinner");
            f.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}

import java.util.*;
import java.io.*;
import java.nio.file.*;
// public class file {
//     public static void main(String[] args){
// try{
//     File f=new File("training.txt");
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
// }
//writer
// public class file {
//     public static void main(String[] args){
//         try(FileWriter f=new FileWriter("training.txt")){
//             f.write("winner winner Chicken Dinner");
//             f.close();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
// }
// }
//access
// public class file {
//     public static void main(String[] args){
//         try{
//             File f=new File("training.txt");
//             Scanner sc=new Scanner(f);
//             while(sc.hasNextLine()){
//                 String data=sc.nextLine();
//                  System.out.println(data);
//             }
//             sc.close();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// public class file {
//      public static void main(String[] args){
//           try{
//                File f=new File("training.txt");
//                String content=Files.readString(f.toPath());
//                content=content.replace("winner","mutton");
//                FileWriter f1=new FileWriter("training.txt");
//                f1.write(content);
//                f1.close();
//                 Scanner sc=new Scanner(f);
//                  while(sc.hasNextLine()){
//                     System.out.println(sc.nextLine());
//                  }
//                  sc.close();
//           } 
//           catch(Exception e){
//                System.out.println(e);
//           }

//      }
//     }
// All delete
// public class file {
//       public static void main(String[] args){
//           try{
//                File f=new File("training.txt");
//                f.delete();
//       }
//       catch(Exception e){
//           System.out.println(e);
//       }
//      }
//      }

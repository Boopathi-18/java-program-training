// import java.util.Scanner;
// public class indexoutofbound {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int arr[]={1,8,2,3};
//         int index =s.nextInt();
//         try{
//             System.out.println("Element at index"+arr[index]);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Index"+index+"is out of bound for this array!");
//         }

//     }
// }
import java.util.*;
public class indexoutofbound {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={1,8,2,3};
        int index =s.nextInt();
        try{
            
            System.out.println("Element at index"+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index"+index+"is out of bound for this array!");
        }

    }
}

import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String[]chan=str.split(" ");
            for(String chans:chan){
                System.out.println(chans.substring(0,1).toUpperCase()+chans.substring(1).toLowerCase()+" ");

            }
        }
    }


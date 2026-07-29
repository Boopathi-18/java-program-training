
import java.util.Scanner;
public class reversetheword {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine(),sr[]=st.split(" ");
        for(int i=sr.length-1;i>=0;i--){
            System.out.print(sr[i]+" ");
        }
    }
}
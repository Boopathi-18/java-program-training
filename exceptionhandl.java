import java.util.Scanner;
public class exceptionhandl {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a:");
        a=s.nextInt();
        System.out.println("Enter the value of b:");
        b=s.nextInt();
        try{
            int result=a/b;
            System.out.println("Result:"+result);
        }
        catch(Exception e){
            System.out.println("cannot divide by zero");
        }finally{
            System.out.println("End program");
        }
    }
}

import java.util.Scanner;

public class dou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        System.out.println(Math.round(n));

        sc.close();
    }
}
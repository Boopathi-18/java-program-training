import java.util.Scanner;

public class cnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int square = n * n;

        if (square % 100 == n)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}
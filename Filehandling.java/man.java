import java.util.Scanner;

public class man {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        for (int i = 1; i <= age; i++) {
            System.out.println("good morning, " + name + "!");
        }

        sc.close();
    }
}
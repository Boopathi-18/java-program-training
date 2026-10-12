import java.util.Scanner;

public class cfow {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();

    for (int i = 0; i < s.length(); i++) {
        if (i == 0 || s.charAt(i - 1) == '-') {
            System.out.print(s.charAt(i));
        }
    }

    System.out.println();
    sc.close();
}
}



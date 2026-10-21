import java.util.Scanner;

public class rvfst {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    String result = s.replaceAll("[aeiouAEIOU]", "");

    System.out.println(result);
    sc.close();
}


}

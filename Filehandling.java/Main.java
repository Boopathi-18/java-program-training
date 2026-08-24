import java.util.*;

public class Main {

    static String[] letters = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void combinations(String digits, int index, String current) {

        if (index == digits.length()) {
            System.out.print(current + " ");
            return;
        }

        int digit = digits.charAt(index) - '0';

        for (char c : letters[digit].toCharArray()) {
            combinations(digits, index + 1, current + c);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String digits = sc.next();

        if (digits.length() > 0) {
            combinations(digits, 0, "");
        }
    }
}
import java.util.*;

public class miss {

    public static List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input:
        // 2
        // 5 1

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findMissingElements(nums));
    }
}
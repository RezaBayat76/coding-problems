import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        int expectedSum = nums.length * (nums.length + 1) / 2;
        return expectedSum - actualSum;
    }
}

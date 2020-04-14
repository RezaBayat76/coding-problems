import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int tail = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int zeroIndex = -1;
                for (int j = 0; j < i; j++) {
                    if (nums[j] == 0) {
                        zeroIndex = j;
                        break;
                    }
                }

                if (zeroIndex != -1) {
                    nums[zeroIndex] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}

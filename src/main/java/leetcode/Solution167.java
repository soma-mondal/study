package leetcode;

public class Solution167 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length;
        while (i<j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] {i+1, j+1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1, -1};
    }

}

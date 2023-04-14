import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4, 7, 8, 9};
        int target = 15;
        System.out.println(Arrays.toString(calculateTwoSum(nums, target)));

    }

    static public int[] calculateTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complementNum  = target - nums[i];
            if (numsIndices.containsKey(complementNum )) {
                return new int[]{numsIndices.get(complementNum ), i};
            }
            numsIndices.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

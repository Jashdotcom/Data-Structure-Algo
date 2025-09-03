public class TwoSum {

    public static void main(String[] args) {

        //Print the indices of the numbers that make up & add to the given target.

        int[] nums = {3,3};
        int target = 6;

        for (int i=0; i<nums.length;i++) {

            for (int j=i + 1;j<nums.length;j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.printf("Indices are : %d, %d", i, j);
                    return;
                }

            }
        }
    }
}
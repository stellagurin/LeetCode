class TwoSum {
    /**
      * @param nums array of numbers in which two numbers will reach a target sum
      * @param target sum to find from array
      * @return int array of two indexes where the sum of the numbers equals target sum
      */
    public int[] twoSum(int[] nums, int target) {
        // assume each nums array will have exactly one solution
        int[] indexSum = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexSum[0] = i;
                    indexSum[1] = j;
                }
            }
        }
        return indexSum;
    }
}

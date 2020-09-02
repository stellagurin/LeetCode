class TwoSum {
    public int[] twoSum(int[] nums, int target) {
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

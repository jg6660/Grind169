class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int other = target - nums[i];

            if(map.containsKey(other) && map.get(other) != i){
                result[0] = i;
                result[1] = map.get(other);
                break;
            }
        }

    return result;
    }
}

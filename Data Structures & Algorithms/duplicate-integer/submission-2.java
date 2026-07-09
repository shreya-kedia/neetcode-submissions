class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueEle =  new HashSet<>();
        for(int num : nums){
            if(uniqueEle.contains(num)) return true;
            uniqueEle.add(num);
        }
        return false;
    }
}
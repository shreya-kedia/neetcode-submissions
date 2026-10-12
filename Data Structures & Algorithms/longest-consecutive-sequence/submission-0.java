class Solution {
    public int longestConsecutive(int[] nums) {
        //HashMap<Integer, Integer> studentAges = new HashMap<>();
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest=0;

        for (Integer n : nums) {

            if(!(numSet.contains(n-1))){
                int current = n;
                int length = 1;
                while(numSet.contains(current+1)){
                    length++;
                    current++;
                }
            longest = Math.max(length, longest);            }
}
return longest;

    }
}

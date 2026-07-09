class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> resultgrp = new List<List<String>>;
        Map<String, List<String>> hmMap = new HashMap();
        for(String str : strs){

            // char[] chars = str.toCharArray();
            // Arrays.sort(chars);
            // String sorted = new String(chars);
            int []count = new int[26];
            for(char c: str.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for( int i : count){
                sb.append(i);
                sb.append("#");
            }
            String key = sb.toString();

            if(!hmMap.containsKey(key)){
                hmMap.put(key, new ArrayList<>());
            }
            hmMap.get(key).add(str);
        }
        return new ArrayList<>(hmMap.values());
    }
}
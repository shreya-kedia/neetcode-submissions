
class Solution {
    public boolean isAnagram(String s, String t) {
       
       if(s.length()!= t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        
        int i=0;
        while(i < s.length()){
            
            sMap.put(s.charAt(i), 1 + sMap.getOrDefault(s.charAt(i),0));
            tMap.put(t.charAt(i), 1 + tMap.getOrDefault(t.charAt(i),0));

            i++;
        }
        System.out.println(sMap.toString());
        System.out.println(tMap.toString());

        return sMap.equals(tMap);        

    }
}

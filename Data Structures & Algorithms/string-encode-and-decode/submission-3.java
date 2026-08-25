class Solution {

    public String encode(List<String> strs) {
    
        StringBuilder encoded = new StringBuilder(); 
        
        for (String item : strs) {
            //System.out.println("In Encode: "+ encoded);
            int sLength = item==""? 0: item.length();
            System.out.println("In Encode: "+ sLength);
            encoded.append(sLength+"#"+item);

            //encoded= sLength+"#"+item;

}

        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

        // Find #
            while (str.charAt(j) != '#') {
            j++;
        }
            int getLength = Integer.parseInt(str.substring(i, j));
            String item = str.substring(j + 1, j + 1 + getLength);
            decodedList.add(item);
            i = j + 1 + getLength;




        }

    //     System.out.println("Decode str: " + str);
    //     if (str.trim().isEmpty()) {
    //     return Arrays.asList("");
    // }
    
    //     List<String> decodedList = Arrays.asList(str.split("#test#"));
     return decodedList; 


    }
}

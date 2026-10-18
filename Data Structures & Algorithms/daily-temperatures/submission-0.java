class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
                
            Deque<Integer> stack = new ArrayDeque<>();
            int count=0;
            int[] result = new int[temperatures.length]; 


            for( int i=0;i<temperatures.length;i++)
            {
                while(!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
                    int prevTemp = stack.pop();
                    result[prevTemp]= i-prevTemp; 
                }
                stack.push(i);
            }

            return result;

    }
}

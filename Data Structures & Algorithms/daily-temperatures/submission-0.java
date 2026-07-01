class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int [temp.length];
        for(int i = 0; i<temp.length; i++){
    while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
      int b =  stack.pop();
        ans[b] = i-b;
    }
    stack.push(i);
    }
    return ans;
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
 Stack<Integer> stack = new Stack<>();
 int i = 0;
    while(i<tokens.length){
        if(tokens[i].equals("+")){
            int a = stack.pop();
            int b = stack.pop();
            int c = a+b;
            stack.push(c);
                    }
         else if(tokens[i].equals("-")){
         int a = stack.pop();
         int b = stack.pop();
         int c = b-a;
         stack.push(c);
                 }        
        else if(tokens[i].equals("*")){
            int a = stack.pop();
            int b = stack.pop();
            int c = a*b;
            stack.push(c);
        }
        else if(tokens[i].equals("/")){
            int a = stack.pop();
            int b = stack.pop();
            int c = b/a;
            stack.push(c);
        }
        else{
            stack.push(Integer.parseInt(tokens[i]));
        }
        i++;
    }
    return stack.pop();
 }

    }


class Solution {
    public static boolean isValid(String s){
        StringBuilder sb = new StringBuilder(s);
        
        String s2 = s.substring(11,13);
        int a = Integer.parseInt(s2);
        if(a>60){
            return true;
        }
        return false;
    }
    public int countSeniors(String[] details) {
        int count=0;
        for(String part : details){
            if(isValid(part)){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int [128];
        int count = 0;
        int maxfreq=0;
        int i =0;
        for(int j=0; j<s.length(); j++){
          freq[s.charAt(j)]++;
          maxfreq = Math.max(maxfreq,freq[s.charAt(j)]);
          while((j-i+1) - maxfreq>k){
            freq[s.charAt(i)]--;
            i++;
          }
          count = Math.max(count,j-i+1);
        }
        return count;
    }
}

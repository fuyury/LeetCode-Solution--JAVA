class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int n = strs.length;
        if(strs.length==0){
                    result = "" ;
        }
        String smallest = strs[0];
        int minlen = 0;
        for(int i=1 ; i<n ; i++){
            if(smallest.length()>strs[i].length()){
                smallest = strs[i];
            }
        }

        Arrays.sort(strs);
        //we sortted all elements so now lets only compare the first and the last one
        //very effective way cause the change in letters will bevery clear once they are in order
        String first = strs[0];
        String last = strs[n-1];

        for(int i=0 ; i<smallest.length() ; i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            result += first.charAt(i);
        }

        return result;
}
}
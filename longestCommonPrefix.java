class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) { // if there is only 1 string or the array elements are null
            return "";
        }
        
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)){ // i increments until != condition is true
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}

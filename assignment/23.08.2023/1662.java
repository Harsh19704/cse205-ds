class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String str1:word1)s1+=str1;
        for(String str2:word2)s2+=str2;
        return s1.equals(s2);
    }
}
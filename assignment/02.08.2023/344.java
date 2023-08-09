class Solution {
    public void reverseString(char[] s) {
      reverse(s,0, s.length - 1);
}
public void reverse(char[]s, int i, int j){
    if(i >= j) 
        return;
    char temp = s[j];
    s[j] = s[i];
    s[i] = temp;
    reverse(s, i + 1, j - 1);
}
    
    }
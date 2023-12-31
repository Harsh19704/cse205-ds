class Solution {
    public String frequencySort(String s) {
      int a[][]=new int[123][2];
        for(char ch:s.toCharArray()){
            a[ch][0]=ch;
            a[ch][1]++;
        }
        StringBuilder sb=new StringBuilder();
        Arrays.sort(a,(b,c)->c[1]-b[1]);
        for(int i=0;i<122;i++){
            if(a[i][1]==0) break;
            for(int j=0;j<a[i][1];j++){
                sb.append((char)a[i][0]);
            }
        }
        return sb.toString();  
    }
}
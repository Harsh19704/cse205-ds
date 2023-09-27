class Solution {
    public int maximumWealth(int[][] accounts) {
      int richestCustomer = 0;

    for (int i = 0; i < accounts.length; i++) {
        int Wealth = 0;
        for (int j = 0; j < accounts[i].length; j++) {
            Wealth += accounts[i][j];
        }
        richestCustomer = Math.max(richestCustomer, Wealth);
    }

    return richestCustomer;
}  
    }

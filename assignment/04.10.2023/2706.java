class Solution {
    public int buyChoco(int[] prices, int money) {
        int i1 = 101;
        int i2 = 101;
        for (int i : prices) {
            if (i1 > i) {
                i2 = i1;
                i1 = i;
            } else if (i2 >= i){
                i2 = i;
            }
        }
        if (i1 + i2 <= money) {
            return money - i1 - i2;
        } else {
            return money;
}
    }
}

  //    Arrays.sort(prices);
    //    if(prices[0] + prices[1] <= money){
    //        return money - (prices[0] + prices[1]);
    //    }
    //    else{
    //        return money;
    //    }
    // }}
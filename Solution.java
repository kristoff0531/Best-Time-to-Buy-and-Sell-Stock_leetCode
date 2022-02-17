package com.company;

class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){

            if(prices[i]<buy){
                buy=prices[i];
            }
            profit=Math.max(profit,prices[i]-buy);

        }
        return profit;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] prices={7,1,5,3,6,4};
//        s.maxProfit(prices);
        System.out.println(s.maxProfit(prices));
    }

}

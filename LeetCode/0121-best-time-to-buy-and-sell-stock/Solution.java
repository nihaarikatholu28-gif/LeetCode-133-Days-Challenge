class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int mbp = Integer.MAX_VALUE;
        int bp = 0;
        for(int sp = 0;sp<prices.length;sp++){
            mbp = Math.min(mbp,prices[bp]);
            int profit = prices[sp] - mbp;
            if(profit > max){
                max = profit;
            }
            bp++;
        }
        return max;
    }
}
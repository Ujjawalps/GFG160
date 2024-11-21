package GFG160.Day04;

public class StockByAndSell {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Maximum Profit: " + maxProfit(prices)); // Output: 865

    }
    static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}

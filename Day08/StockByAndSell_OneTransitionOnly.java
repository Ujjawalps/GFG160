package GFG160.Day08;

public class StockByAndSell_OneTransitionOnly {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 11};
        System.out.println(maximumProfit(arr));
    }
    static int maximumProfit(int prices[]) {
        // Code here
        int min = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (price < min)
                min = price;
            if (profit < price - min)
                profit = price - min;
        }
        return profit;
    }
}

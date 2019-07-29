package Coding.Training.LC2019_07_21;

public class LC122_maxProfit2 {

    /*
    *
    * We just need to get all the positive profit between two days.
    * And sum all the transaction profits.
    *
    * */
    public static int maxProfit(int[] prices) {
        int profits = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                profits += prices[i + 1] - prices[i];
            }
        }

        return profits;
    }
}

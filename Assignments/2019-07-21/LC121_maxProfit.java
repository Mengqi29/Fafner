package Coding.Training.LC2019_07_21;

import java.util.ArrayList;
import java.util.Collections;

public class LC121_maxProfit {

    /*
    * If the profit is larger than 0, save all the possible profit to arraylist.
    * Sort the arraylist and get the last which means the biggest one.
    *
    *
    */
    public static int maxProfit(int[] nums) {
        ArrayList<Integer> profit = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; ++j) {
                if (nums[j] - nums[i] > 0) {
                    profit.add(nums[j] - nums[i]);
                    // System.out.println("day: "+ i + " day: " + j + " profit: " + (nums[j] - nums[i]));
                }
            }
        }

        if (!profit.isEmpty()) {
            Collections.sort(profit);
            return profit.get(profit.size() - 1);
        }

        return 0;
    }

    /*
    * Assume we buy stock on the first day. If stock price on the second day is higher, we save the positive profit.
    * Then, if stock price on the third day is lower, we just sell stock on the second day and compare the third day price with first day.
    * If stock price on third day is higher than one on first day, we will continue to buy stock on th first because it is the lowest price so far.
    * If stock price on fourth day is higher than the second day which means we can get more profit, we will sell stock on fourth day.
    * ...
    *
    * If we found there is a stock price is lower than the first day, we should buy it instead of the first day price because it is possible to get more profit.
    * If we won't get more profit on the following days, we just return the largest profit.
    * */

    public static int maxProfit_method2(int[] nums) {

        if (nums.length == 0) return 0;

        int buyPrice = nums[0], profit = 0;
        for (int i = 1; i < nums.length; i++) {
           if (nums[i] > buyPrice) {
               if (profit < nums[i] - buyPrice)
                   profit = nums[i] - buyPrice;
           } else {
               if (nums[i] < buyPrice) {
                   buyPrice = nums[i];
               }
           }
        }

        return profit;
    }


}

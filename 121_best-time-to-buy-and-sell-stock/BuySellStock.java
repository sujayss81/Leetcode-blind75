public class BuySellStock {
    public static void main(String[] args) {
        int res = maxProfit(new int[] { 7, 6, 4, 3, 1 });
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        int maxProf = 0;
        int max = prices[0];
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                if (maxProf < max - min) {
                    maxProf = max - min;
                }
                max = min = prices[i];
            } else if (prices[i] > max)
                max = prices[i];
        }

        return maxProf > max - min ? maxProf : max - min;
    }
}

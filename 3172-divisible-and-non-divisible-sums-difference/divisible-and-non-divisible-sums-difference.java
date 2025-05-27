class Solution {
    public int differenceOfSums(int n, int m) {
        int non_div_sum = 0;
        int div_sum = 0;
        int i = 1;

        while (i <= n) {
            div_sum += (i % m == 0) ? i : 0;
            non_div_sum += (i % m != 0) ? i : 0;
            i++;
        }

        return non_div_sum - div_sum;
    }
}

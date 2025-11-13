class Solution {
    public int maxOperations(String s) {
         int ones = 0;
        int ops = 0;

        int n = s.length();
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '1') {
                ones++;
                i++;
            } else {
                ops += ones;
                while (i < n && s.charAt(i) == '0') {
                    i++;
                }
            }
        }
        return ops;       
    }
}
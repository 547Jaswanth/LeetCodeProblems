class Solution {
    public String largestGoodInteger(String num) {

         if (num.length() < 3) {
            return "not";
        }

        int num1 = -1; 
        String res = "";

        for (int i = 0; i <= num.length() - 3; i++) { 
            String part = num.substring(i, i + 3);

            if (part.charAt(0) == part.charAt(1) && part.charAt(1) == part.charAt(2)) {
                int n = Integer.parseInt(part);

                if (res.equals("") || n > num1) {
                    num1 = n;
                    res = part;
                }
            }
        }
        return res.equals("") ? "" : res;
    }
}
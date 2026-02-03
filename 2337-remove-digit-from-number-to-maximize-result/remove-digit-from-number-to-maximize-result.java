class Solution {
    public String removeDigit(String number, char digit) {

        int removeIndex=-1;

        // First digit accurence remove
        for(int i=0;i<number.length()-1;i++)
        {
            if(number.charAt(i)==digit && number.charAt(i+1)>digit)
            {
                removeIndex = i;
                break;
            }
        }

        if(removeIndex==-1)
        {
            removeIndex = number.lastIndexOf(digit);
        }

        return number.substring(0,removeIndex)+number.substring(removeIndex+1);
    }
}
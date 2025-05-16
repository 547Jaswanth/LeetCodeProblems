class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
           int start=groups[0];
        List<String> resList=new ArrayList<>();

        resList.add(words[0]);
        for(int i=1;i<words.length;i++)
        {
            if(groups[i]!=start)
            {
                resList.add(words[i]);

                start=groups[i];
            }
        }
        return resList;
    }
}
class Solution {
    public int differenceOfSums(int n, int m) {
        int non_div_sum=0;
        int div_sum=0;
        int i=1;
        // for(int i=1;i<=n;i++)
        // {
        //     if(i%m==0){
        //         div_sum+=i;
        //     }
        //     else{
        //     non_div_sum+=i;
        //     }
        // }
        // return non_div_sum - div_sum;

        while(i<=n)
        {
            if(i%m==0){
                div_sum+=i;
            }
            else{
            non_div_sum+=i;
            }
            i++;
        }
        return non_div_sum - div_sum;
    }
}
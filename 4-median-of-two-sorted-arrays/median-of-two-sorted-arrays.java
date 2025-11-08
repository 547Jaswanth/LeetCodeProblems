class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] margedArray= new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,margedArray,0,nums1.length);
        System.arraycopy(nums2,0,margedArray,nums1.length,nums2.length);

        Arrays.sort(margedArray);

        if(margedArray.length%2==1)
        {
            return margedArray[margedArray.length/2];
        }
        else
        {
            return (margedArray[margedArray.length/2-1]+margedArray[margedArray.length/2])/2.0;
        }

    }
}
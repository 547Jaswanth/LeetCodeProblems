class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newFull = empty / numExchange;
            empty = empty % numExchange + newFull;
            totalDrunk += newFull;
        }

        return totalDrunk;
        
    }
}
class Solution {

    public int[] nextSmallerToRight(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int[] right = new int[n];
        int pseudoIndex = n;

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? pseudoIndex : stack.peek();
            stack.push(i);
        }
        return right;
    }

    public int[] nextSmallerToLeft(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int[] left = new int[n];
        int pseudoIndex = -1;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? pseudoIndex : stack.peek();
            stack.push(i);
        }
        return left;
    }

    public int maxAreaHistogram(int[] heights) {
        int n = heights.length;
        int[] right = nextSmallerToRight(heights);
        int[] left = nextSmallerToLeft(heights);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] height = new int[cols];
        int maxArea = 0;

        // First row
        for (int j = 0; j < cols; j++) {
            height[j] = (matrix[0][j] == '1') ? 1 : 0;
        }
        maxArea = maxAreaHistogram(height);

        // Remaining rows
        for (int i = 1; i < rows; i++) {

            // Update histogram heights
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '0') {
                    height[j] = 0;
                } else {
                    height[j]++;
                }
            }

            // Calculate max area for this row's histogram
            maxArea = Math.max(maxArea, maxAreaHistogram(height));
        }

        return maxArea;
    }
}
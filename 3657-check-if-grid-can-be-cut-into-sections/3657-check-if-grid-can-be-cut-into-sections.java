class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return Math.max(countCuts(rectangles, true), countCuts(rectangles, false)) >= 3;
    }

    public int countCuts(int[][] rectangles, boolean isX) {
        ArrayList<int[]> events = new ArrayList<>();
        
        for (int i = 0; i < rectangles.length; i++) {
            if (isX) {
                events.add(new int[]{rectangles[i][0], 1}); // Start
                events.add(new int[]{rectangles[i][2], -1}); // End
            } else {
                events.add(new int[]{rectangles[i][1], 1}); // Start
                events.add(new int[]{rectangles[i][3], -1}); // End
            }
        }

        Collections.sort(events, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int count = 0;
        int cuts = 0;

        for (int[] event : events) {
            count += event[1];
            if (count == 0) {
                cuts++;
            }
        }
        
        return cuts;
    }
}

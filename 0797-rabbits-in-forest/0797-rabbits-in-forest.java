class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        int total = 0;
        for (int key : map.keySet()) {
            int count = map.get(key);
            int groupSize = key + 1;
            int groups = (count + groupSize - 1) / groupSize; // ceil(count / groupSize)
            total += groups * groupSize;
        }

        return total;
    }
}

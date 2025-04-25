class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Long> freq = new HashMap<>();
        freq.put(0, 1L); // Initialize with prefix 0
        long result = 0;
        int count = 0;

        for (int num : nums) {
            if (num % modulo == k) {
                count++;
            }

            int currentMod = count % modulo;
            // Compute (currentMod - k + modulo) % modulo to handle negative mods
            int need = (currentMod - k + modulo) % modulo;

            result += freq.getOrDefault(need, 0L);
            freq.put(currentMod, freq.getOrDefault(currentMod, 0L) + 1);
        }

        return result;
    }
}

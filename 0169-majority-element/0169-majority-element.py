class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq={}
        for i in nums:
            freq[i]=freq.get(i,0)+1
        for k,v in freq.items():
            if v > len(nums)//2:
                return k
        
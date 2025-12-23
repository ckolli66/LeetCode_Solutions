class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count,max_Count=0,0
        for i in nums:
            if i == 0:
                max_Count = max(count,max_Count)
                count=0
            else :
                count+=1
        return max(count,max_Count)
        
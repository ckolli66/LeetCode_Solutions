import sys
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n=len(nums)
        sum,maxSum = nums[0],nums[0]
        for i in range(1,n):
            sum=max(nums[i],sum+nums[i])
            maxSum=max(sum,maxSum)
        return maxSum


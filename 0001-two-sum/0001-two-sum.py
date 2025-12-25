class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        check_indices={}
        for i in range(0,len(nums)):
            if (target-nums[i]) in check_indices:
                return [i,check_indices[target-nums[i]]]
            check_indices[nums[i]]=i
        return None 
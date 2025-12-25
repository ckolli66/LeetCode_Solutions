class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        final_indices=[]
        check_indices={}
        for i in range(0,len(nums)):
            if (target-nums[i]) in check_indices:
                final_indices.append(i)
                final_indices.append(check_indices[target-nums[i]])
            check_indices[nums[i]]=i
        return final_indices 
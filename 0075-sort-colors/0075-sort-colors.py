class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        freq=[0,0,0]
        for i in nums:
            freq[i]+=1
        inx=0
        for i in range(freq[0]):
            nums[inx]=0
            inx+=1
        for i in range(freq[1]):
            nums[inx]=1
            inx+=1
        for i in range(freq[2]):
            nums[inx]=2
            inx+=1
        
        



        
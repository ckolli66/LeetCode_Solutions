class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        positive=0
        negative=1
        result=[]
        for i in nums:
            if i>0:
                result.insert(positive,i)
                positive+=2
            else:
                result.insert(negative,i)
                negative+=2
        return result
            
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit,maxProfit=0,0
        i,j=0,1
        n=len(prices)
        while i<n and j<n:
            if prices[j]-prices[i]>0:
                profit=prices[j]-prices[i]
                maxProfit=max(profit,maxProfit)
                j+=1
            else:
                i=j
                j+=1
        return maxProfit
        
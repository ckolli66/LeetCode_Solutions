class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> numbers=new ArrayList<Integer>();
        for(int i=1;i<10;i++)
        {
            dfs(i,n,numbers);
        }
        return numbers;
    }
    public static void dfs(int currentNumber,int limit,List<Integer> numbers)
    {
        if(currentNumber>limit)
        {
            return;
        }
        numbers.add(currentNumber);
        currentNumber*=10;
        for(int i=0;i<10;i++)
        {
           dfs(currentNumber+i,limit,numbers);
        }
    }
}
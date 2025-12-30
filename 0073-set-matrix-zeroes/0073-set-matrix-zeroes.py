class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m=len(matrix)
        n=len(matrix[0])
        rows=[]
        columns=[]
        for i in range(0,m):
            for j in range(0,n):
                if matrix[i][j] == 0:
                        rows.append(i)
                        columns.append(j)
        for i in range(0,len(rows)):
            self.makezeroMatrix(rows[i],columns[i],m,n,matrix)
    def makezeroMatrix(self,row :int,column :int,rowLength :int,columnLength :int,matrix: List[List[int]]) -> None:
        for i in range(0,rowLength):
            for j in range(0,columnLength):
                if i==row:
                    matrix[i][j]=0
                if j==column:
                    matrix[i][j]=0
                                       


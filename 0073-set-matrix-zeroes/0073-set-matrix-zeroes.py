class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m, n = len(matrix), len(matrix[0])
        rows, cols = set(), set()

        for i in range(m):
            for j in range(n):
                if matrix[i][j] == 0:
                    rows.add(i)
                    cols.add(j)

        for r in rows:
            for j in range(n):
                matrix[r][j] = 0

        for c in cols:
            for i in range(m):
                matrix[i][c] = 0
    #     m=len(matrix)
    #     n=len(matrix[0])
    #     rows=[]
    #     columns=[]
    #     for i in range(0,m):
    #         for j in range(0,n):
    #             if matrix[i][j] == 0:
    #                 rows.append(i)
    #                 columns.append(j)
    #     for i in range(0,len(rows)):
    #         self.makezeroMatrix(rows[i],columns[i],m,n,matrix)
    # def makezeroMatrix(self,row :int,column :int,rowLength :int,columnLength :int,matrix: List[List[int]]) -> None:
    #     for i in range(columnLength):
    #         matrix[row][i]=0
    #     for j in range(rowLength):
    #         matrix[j][column]=0
                                       


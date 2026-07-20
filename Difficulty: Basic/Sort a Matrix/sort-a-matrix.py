class Solution:
    def sortedMatrix(self, mat):
        # Flatten the matrix
        arr = []
        for row in mat:
            arr.extend(row)
        arr.sort()
        k = 0
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                mat[i][j] = arr[k]
                k += 1

        return mat
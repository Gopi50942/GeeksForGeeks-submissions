class Solution:
    def mergeArrays(self, a, b):
        l = a + b
        l.sort()
        for i in range(len(l)):
            if i < len(a):
                a[i] = l[i]
            else:
                b[i - len(a)] = l[i]
        return a, b

# encoding = utf-8
import copy
def is_palindrome(n):
    count = 0
    numlist = []
    while n >= 1:
        temp = divmod(n, 10)
        numlist.append(temp[1])
        n = temp[0]
        count += 1
    numlistcp = copy.deepcopy(numlist)
    numlist.reverse()
    for i in range(len(numlist)):
        if numlistcp[i] != numlist[i]:
            return False
        return True

output = filter(is_palindrome, range(1, 1000))
print(list(output))

# coding=utf-8
from functools import reduce
import math

def normalize(name):
    return name.capitalize()
    # return name[0].upper() + name[1:].lower()

# L1 = ['adam', 'LISA', 'barT']
# L2 = list(map(normalize, L1))
# print(L2)


def prod(L):
    # def product(x, y):
    #     return x * y
    # return reduce(product, L)
    return reduce(lambda x, y: x * y, L)
# print('3 * 5 * 7 * 9 =', prod([3, 5, 7, 9]))


def str2float(s):
    flag = False
    count = 0
    def char2num(s):
        return {'.': -1, '0': 0, '1': 1, '2': 2, '3': 3, '4': 4,
                '5': 5, '6': 6, '7': 7, '8': 8, '9': 9}[s]
    def num2float(x, y):
        nonlocal flag
        nonlocal count
        if x == -1:
            flag = True
            count -= 1
            return y * math.pow(10, count)

        if y == -1:
            flag = True
            return x

        if x != -1 and y != -1:
            if flag:
                count -= 1
                return x + y * math.pow(10, count)

            if not flag:
                return x * 10 + y
    return reduce(num2float, map(char2num, s))

# CHAR_TO_FLOAT = {
#     '0': 0,
#     '1': 1,
#     '2': 2,
#     '3': 3,
#     '4': 4,
#     '5': 5,
#     '6': 6,
#     '7': 7,
#     '8': 8,
#     '9': 9,
#     '.': -1
# }
#
# def str2float(s):
#     nums = map(lambda ch: CHAR_TO_FLOAT[ch], s)
#     point = 0
#     def to_float(f, n):
#         nonlocal point
#         if n == -1:
#             point = 1
#             return f
#         if point == 0:
#             return f * 10 + n
#         else:
#             point = point * 10
#             return f + n / point
#     return reduce(to_float, nums, 0.0)

# print('str2float(\'123.456\') =', str2float('123.456'))
# print('str2float(\'123456\') =', str2float('123456'))
print('str2float(\'1.23456\') =', str2float('1.23456'))
# print('str2float(\'.123456\') =', str2float('.123456'))
# print('str2float(\'0.123456\') =', str2float('0.123456'))
print('str2float(\'0\') =', str2float('0'))
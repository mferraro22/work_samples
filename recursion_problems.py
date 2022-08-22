"""
PROGRAM:........... recursion problems
AUTHOR:............ <Ferraro>, <Matthew>
COURSE:............ CSC 231 801-803
TERM:.............. Fall 2020
"""


# INSTRUCTIONS:
#   1) Put your name at the top
#   2) Complete the problems below. The solutions _must be recursive_ to earn any credit. 
#   3) NO LOOPS in any of your functions!
#   4) Each function is worth 5 points. They are scored based on passing tests.
#   5) Run this file to run the tests.
#   6) You may complete the functions in any order.
#   7) The assignment is worth 25 points. You can potentially earn 40/25 by completing all functions.

def power(n, p):
    """
    compute and return n^p. Assume n and p are integers >= 0.
    """
    if p == 0:
        return 1
    elif p == 1:
        return n
    else:
        return n * power(n, p - 1)


def list_sum(lst):
    """
    Returns the sum of all the numbers in lst. lst will not be empty.
    """
    if len(lst) == 1:
        return lst[0]
    else:
        return lst[0] + list_sum(lst[1:])


def reverse(s):
    """
    Returns the reverse of string s.
    s may be an empty string; the reverse of an empty string is just an empty string.
    """
    if len(s) == 0 or len(s) == 1:
        return s
    else:
        return reverse(s[1:]) + s[0]


def contains(lst, target):
    """
    Returns True if lst contains target, False otherwise
    """
    if len(lst) == 0:
        return False
    elif target == lst[-1]:
        return True
    else:
        return contains(lst[:-1], target)


def range_list(num):
    """
    Returns a list containing values 0..num, both inclusive
    Examples:
        range_list(10) returns [0,1,2,3,4,5,6,7,8,9,10]
        range_list(5) returns [0,1,2,3,4,5]
    """
    if num == 0:
        return [0]
    else:
        return range_list(num - 1) + [num]


def equals(s1, s2):
    """
    Returns True if strings s1 and s2 contain exactly the same characters in the same order, False otherwise
    """
    if s1 == s2:
        return True
    else:
        return s1 == equals(s1[:-1+1], s2[:-1+1])


def is_prefix(pre, s):
    """
    Returns true if pre is a prefix for s, i.e. s starts with pre, False otherwise
    Examples:
        is_prefix("app", "apple") returns True
        is_prefix("py", "python") returns True
        is_prefix("pytx", "python") returns False
    """
    if pre == s:
        return True
    elif len(pre) > len(s):
        return False
    else:
        return is_prefix(pre, s[:-(len(s)-len(pre))])


def deep_sum(lst):
    """
    Returns sum of items in lst even if lst contains lists which contain
    other lists which contain other lists...
    Assume lst contains only numbers or lists of numbers.
    Examples:
        deep_sum([1,2,[3,4,[5,6,7]],8]) returns 36
        deep_sum([1,2,[3,4],5]) returns 15
        deep_sum([1,2,3,4]) returns 10
    """

    if not lst:
        return 0
    elif type(lst[0]) == list:
        return deep_sum(lst[0]) + deep_sum(lst[1:])
    else:
        return lst[0] + deep_sum(lst[1:])


if __name__ == "__main__":
    from recursion_tests import TestSuite
    import sys

    suite = TestSuite(sys.modules[__name__])
    suite.test_all()  # Comment out this line to hide the test output

    # Feel free to add code below to help you test

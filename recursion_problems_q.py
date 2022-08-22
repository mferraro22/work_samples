# INSTRUCTIONS:
#   1) Put your name at the top
#   2) Complete the problems below. The solutions _must be recursive_ to earn any credit. 
#   3) LOOPS and many built-in functions cannot appear in your solution. See comments below for what you CAN use.
#   4) Each function is worth 5 points. They are scored based on passing tests.
#   5) Run this file to run the tests.
#   6) You may complete the functions in any order.
#   7) The assignment is worth 25 points. You can potentially earn 40/25 by completing all functions.

# You do not need any built-in functions to solve these problems other than basic arithmetic operators, boolean operators,
# if-else, return, and assorted Python list[] methods (append, slicing, subscripting, etc.)

# Yes, you could solve some of these problems very easily using built-in functions, but the goal is to get you thinking recursively.
# Recursion will be a theme in your final few assignments.
#
# If you are struggling, think about how to solve the programming problems using a for-loop and only very basic operators
# (no things like "startswith" or "in") . Most of the loop-based solutions will be very simple and entail something
# like a counter variable, or going through a string character-by-character.
#
# Every problem that can be solved with iteration can be solved using recursion. Once you have a loop-based solution,
# try to translate that loop into a recursive function.


def power(n, p):
    """
    compute and return n^p. Assume n and p are integers >= 0.
    """
    if p == 0:
        return 1
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
    if s == '':
        return ''
    elif len(s) == 1:
        return s[0]
    else:
        return reverse(s[1:]) + s[0]


def contains(lst, target):
    """
    Returns True if lst contains target, False otherwise
    """
    if lst == []:
        return False
    elif lst[0] == target:
        return True
    else:
        return contains(lst[1:], target)


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
        result = range_list(num - 1)
        result.append(num)
        return result


def equals(s1, s2):
    """
    Returns True if strings s1 and s2 contain exactly the same characters in the same order, False otherwise
    """
    if s1 == '' and s2 == '':
        return True
    elif (s1 == '' and s2 != '') or (s1 != '' and s2 == ''):
        return False
    else:
        return s1[0] == s2[0] and equals(s1[1:], s2[1:])


def is_prefix(pre, s):
    """
    Returns true if pre is a prefix for s, i.e. s starts with pre, False otherwise
    Examples:
        is_prefix("app", "apple") returns True
        is_prefix("py", "python") returns True
        is_prefix("pytx", "python") returns False
    """
    if pre == '':
        return True
    elif s == '':
        return False
    elif s[0] != pre[0]:
        return False
    else:
        return is_prefix(pre[1:], s[1:])


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
    if lst == []:
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

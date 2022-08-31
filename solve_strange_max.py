# string1 = "rUns dOg"
#
#
# def swap_case(string1):
#     new_string = ""
#     upper_alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
#     lower_alpha = upper_alpha.lower()  # "abcdefghijklmnopqrstuvwxyz"
#     for char in string1:
#         if char not in upper_alpha:
#             new_string = new_string + char.upper()
#         elif char not in lower_alpha:
#             new_string = new_string + char.lower()
#         print(new_string)
#
#
# swap_case(string1)
#
# Student name(s): Matthew Ferraro, Tristan Freeman

test_list = [1, 2, 3, 6, 5, 4, 7, 8]  # main integer list
range1, range2, range3 = len(test_list) // 3, len(test_list) // 3 * 2 + 1, len(test_list) // 3 * 3 + 2  # range limit
sublist1, sublist2, sublist3 = test_list[0:range1], test_list[range1:range2], test_list[range2:range3]  # range sublist
new_sublist1, new_sublist2, new_sublist3 = sublist1 + sublist2, sublist1 + sublist3, sublist2 + sublist3  # new sublist
input_list = [new_sublist1, new_sublist2, new_sublist3]  # list of new sublist

# max store 1-3
max1, max2, max3 = 0, 0, 0

# main method - carries in input list, max1, max2, max3 not a parameter, new_sublist 1 + 2, 1 + 3, and 2 + 3


def dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3):

    # descriptive docstring

    """
    Dr. Song's Strange Max -- DIVIDE AND CONQUER RECURSIVE ALGORITHM
    Returns the max value of 3 max values of a combination of sublists 1-3
    max(sublist1[0], sublist2[1], sublist3[2]

    Examples:
        input_list = [1, 2, 3, 6, 5, 4, 7, 8]
        sublist1 = [1, 2]
        sublist2 = [3, 6, 5]
        sublist3 = [4, 7, 8]
    """

    # base case 1

    if len(input_list) == 0:
        return

    # base case 2

    elif len(input_list) == 1:
        return input_list[0][0]

    # new sublist1 base case 1

    elif len(new_sublist1) == 1 and max1 == 0:
        max1 = new_sublist1[0]
        dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

    # new sublist2 base case 2

    elif len(new_sublist1) == 0 and max1 != 0:
        max2 = new_sublist2[0]
        dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

    # new sublist1 base case 3 and final return case

    elif len(new_sublist1) == 1 and len(new_sublist2) == 1 and len(new_sublist3) == 1:
        max3 = new_sublist3[0]
        strange_max = max(max1, max2, max3)
        print(strange_max)
        return strange_max

    # recursive elimination sort - eliminates instead of swapping values

    else:

        # sublist1

        print(input_list)
        if len(new_sublist1) >= 2 and new_sublist1[0] < new_sublist1[1]:
            del new_sublist1[0]
            return dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

        elif len(new_sublist1) >= 2 and new_sublist1[0] > new_sublist1[1]:
            del new_sublist1[1]
            return dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

        # sublist2

        elif len(new_sublist2) >= 2 and new_sublist2[0] < new_sublist2[1]:
            del new_sublist2[0]
            return dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

        elif len(new_sublist2) >= 2 and new_sublist2[0] > new_sublist2[1]:
            del new_sublist2[1]
            return dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

        # sublist3

        elif len(new_sublist3) >= 2 and new_sublist3[0] < new_sublist3[1]:
            del new_sublist3[0]
            return dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

        elif len(new_sublist3) >= 2 and new_sublist3[0] > new_sublist3[1]:
            del new_sublist3[1]
            return dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

# method call


dr_song_strange_max(input_list, max1, max2, new_sublist1, new_sublist2, new_sublist3)

# Matthew Ferraro
# HackerRank Solution
# Hash Tables: Ransom Note

from collections import Counter

def checkMagazine(magazine, note):

	"""
	The goal was to see which words were used in the note
	from the magazine to try to catch the criminal behind
	the ransom note, including keeping track of duplicate words.
	"""

    # Write your code here
    m = Counter(magazine)
    n = Counter(note)
    sep_elements = n - m
    if list(sep_elements.elements()) == []:
        print("Yes")
    else:
        print("No")

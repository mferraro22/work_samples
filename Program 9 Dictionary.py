#==========================================================================
# PROGRAM PURPOSE:... e-Dictionary Foreign Translator
# AUTHOR:............ Ferraro, Matthew
# COURSE:............ CSC 131-007
# TERM:.............. Fall 2019
# COLLABORATION:..... Self and one small piece, last example on webpage from:
#                     https://www.learnbyexample.org/python-nested-dictionary/
# WORK TIME(h:mm):... Took a couple hours to construct basic dictionary
#                     And WAY too long to fix small error
#==========================================================================

import sys

# dictionary

edict = {
    'Hello': {'English': 'Hello',
    'French': 'Bonjour',
    'Spanish': 'Hola',
    'Italian': 'Ciao',
    'German': 'Hallo',
    'Farsi': 'Salaam'},
    'Goodbye': {'English': 'Goodbye',
    'French': 'Au Revoir',
    'Spanish': 'Adios',
    'Italian': 'Ciao',
    'German': 'Auf Wiedersehen',
    'Farsi': 'Khodda Haafez'}
}

uky = edict.keys()
        
def menu_select():
    """Allows user to select from menu items"""
    print('')
    print('*** e-Dictionary Foreign Translator ***')
    print('')
    print('*********')
    print('Main Menu')
    print('*********')
    print('')
    print('1 - Translate a word')
    print('2 - Add translation to e-Dictionary')
    print('3 - Delete translation or word from e-Dictionary')
    print('4 - Print current translation e-Dictionary')
    print('5 - Exit')

    print('')
    while True:
        try: 
            select = int(input("Please select an option from the Main Menu: "))
        except ValueError:
            print('')
            print('*** Please enter 1-5 from the Main Menu ***')
            menu_select()
            continue
        if select < 1 or select > 5:
            print('')
            print('*** Please enter 1-5 from the Main Menu ***')
            menu_select()
            continue
        else:
            break
    if select == 1:
        translate_word() 
    elif select == 2:
        add_translation()
    elif select == 3:
        deleteTranslation()
    elif select == 4:
        printDict()
        menu_select()
    elif select == 5:
        print('')
        return exit_dict()
        
def translate_word():
    """Allows user to translate a word"""
    while True:
        if bool(edict) == False:
            print('')
            print('***************************************************')
            print('You must add words to the e-Dictionary to translate')
            print('***************************************************')
            menu_select()
        else:
            break
    print('')    
    print('***************')
    print('Translate Words')
    print('***************')
    print_words()
    print('')
    while True:
        try:
            word = input('Choose a word to translate? ')
            word = word.title()
        except ValueError:
            print('')
            print('*** Choose a word in the e-Dictionary ***')
            print('')
            translate_word()
            continue
        if word not in uky:
            print('')
            print('*** Choose a word in the e-Dictionary ***')
            print('')
            translate_word()
        else:
            break
    
    while True:
        print_lang()
        try:
            print('')
            lang = input('What language would you like to translate? ')
            lang = lang.title()
            print('')
        except ValueError:
            print('')
            print('*** Sorry,',lang,'is not in e-Dictionary languages ***')
            print('')
            continue
        if lang not in edict[word]:
            print('*** Sorry,',lang,'is not in e-Dictionary languages ***')
            continue
        else:
            print('************************************')
            print(word, 'is', edict[word][lang],'in',lang)
            print('************************************')
            menu_select()
        
def add_translation():
    """Allows user to add a translation"""
    print('')
    print('***************')
    print('Add Translation')
    print('***************')
    print('')
    while True:
        try:
            word = input('Please select a word for translation: ')
            word = word.title()
        except ValueError:
            print('')
            print('*** Please select a word for translation ***')
            continue
        else:
            break
        
    while True:
        print('')
        try:
            lang = input('Please select a language for translation: ')
            lang = lang.title()
        except ValueError:
            print('')
            print('*** Please type a language for translation ***')
            continue
        if lang in uky:
            print('')
            print('*** You cannot use',lang,'for a language ***')
            continue
        else:
            break
    while True:
        print('')
        try:
            value = input('Please select a translation for chosen language: ')
            value = value.title()
        except ValueError:
            print('')
            print('*** Please select a translation for chosen language ***')
            continue
        else:
            break
    if word in uky:
        edict[word][lang] = value
        print('')
        print('***************************************************************')
        print('The translation for',lang,'has been added to',word)
        print('***************************************************************')
        menu_select()
    else:
        edict[word] = {lang: value}
        print('')
        print('***************************************************************')
        print('The translation for',lang,'has been added to',word)
        print('***************************************************************')
        menu_select()

def deleteTranslation():
    """Allows user to delete a translation"""
    print('')
    print('**************************')
    print('Delete Translation or Word')
    print('**************************')
    print('')
    tw = ['T','W','M']
    while True:
        try:
            quest = input('Delete a single \
translation(T), an entire word(W), or back to Main Menu(M)? ')
            quest = quest.title()
        except ValueError:
            print('')
            print('*** Must be Translation(T), Word(W), or Main Menu(M) ***')
            print('')
            deleteTranslation()
            continue
        if quest not in tw:
            print('')
            print('*** Must be Translation(T), Word(W), or Main Menu(M) ***')
            print('')
            deleteTranslation()
            continue
        else:
            break
    if quest == 'W':
        delete_word()
    elif quest == 'M':
        menu_select()
    print_words()
    print('')
    while True:
        try:
            word = input("Please select a word to remove the \
translations only: ")
            word = word.title()
        except ValueError:
            print('')
            print('*** Translation deletion word must be in the e-Dictionary ***')
            deleteTranslation()
            continue
        if word not in uky:
            print('')
            print('*** Translation deletion word must be in the e-Dictionary ***')
            deleteTranslation()
        else:
            break
    while True:
        print_lang()
        print('')
        try:
            lang = input('Please select a language for translation deletion: ')
            lang = lang.title()
        except ValueError:
            print('')
            print('*** Sorry,',lang,'is not in e-Dictionary languages ***')
            continue
        if lang in uky:
            print('')
            print('*** Sorry,',lang,'is not in e-Dictionary languages ***')
        elif lang not in edict[word]:
            continue
        else:
            del edict[word][lang]
            print('')
            print('*****************************************************************************')
            print('The translation for',word,'in',lang,'has been deleted \
from the e-Dictionary')
            print('*****************************************************************************')
            menu_select()

def delete_word():
    """Under removal function, allows user to delete a word as well"""
    while True:
        print_words()
        print('')
        try:
            word = input('Please select a word for e-Dictionary deletion: ')
            word = word.title()
        except ValueError:
            print('')
            print('*** Choose a word in e-Dictionary words for removal ***')
            delete_word()
            continue
        if word not in uky:
            print('')
            print('*** Sorry,',word,'is not in e-Dictionary words ***')
            delete_word()
            continue
        else:
            del edict[word]
            print('')
            print('************************************************************')
            print('The word for',word,'has been deleted \
from the e-Dictionary')
            print('************************************************************')
            menu_select()

def printDict():
    """Allows user to print the current dictionary"""
    while True:
        if bool(edict) == False:
            print('')
            print('************************************************')
            print('There are currently no words in the e-Dictionary')
            print('************************************************')
            print('')
            menu_select()
        else:
            break
    for id, dictionary in edict.items():
        print('')
        print('*********************')
        print('e-Dictionary:', id)
        print('*********************')
        print('')
        for ukey in dictionary:
            print(ukey + ':', dictionary[ukey])

def print_words():
    """Allows uesr to view current available words in other functions"""
    print('')
    print('******************')
    print('e-Dictionary Words')
    print('******************')
    print('')
    for id, dictionary in edict.items():
        print(id)
    
def print_lang():
    """Allows user to view current available languages in other functions"""
    for id, dictionary in edict.items():
        print('')
        print('**********************************')
        print("e-Dictionary languages for", id)
        print('**********************************')
        print('')
        for ukey in dictionary:
            print(ukey)

def exit_dict():
    return sys.exit('*** Thank you for using the e-Dictionary ***')

menu_select()

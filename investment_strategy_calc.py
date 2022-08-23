# This content is copyrighted - Matthew Ferraro
import sys
def menu_select():
    """Allows user to select from menu items"""
    print("\n--------------------------------")
    print("    Elite Finance Calculator    ")
    print("           Main Menu            ")
    print("--------------------------------\n")
    print("1 - Gains Calculator")
    print("2 - Percentage Calculator Menu")
    print("3 - Basic Calculator - Not yet implemented")
    print("4 - Finance Calculator - Not yet implemented")
    print("5 - Exit\n")
    while True:
        try:
            select = int(input("Please select an option from the Elite Finance Calculator Main Menu: "))
        except ValueError:
            print("\n*** Invalid Selection: Please enter 1-3 from the Percentage Calculator Menu ***")
            menu_select()
            continue
        if select < 1 or select > 5:
            print("\n*** Invalid Selection: Please enter 1-3 from the Percentage Calculator Menu ***")
            menu_select()
            continue
        if select == 1:
            calc()
        elif select == 2:
            percent_calc_menu()
        elif select == 5:
            sys.exit("\nThank you, have a nice day!")

def percent_calc_menu():
    print("\n--------------------------------")
    print("    Percent Calculator Menu          ")
    print("--------------------------------\n")
    print("1 - Percent Calculator")
    print("2 - Numerator Calculator")
    print("3 - Denominator Calculator")
    print("4 - Elite Finance Calculator Main Menu")
    print("5 - Exit\n")
    while True:
        try:
            select = int(input("Please select an option from the Percentage Calculator Menu: "))
        except ValueError:
            print("\n*** Invalid Selection: Please enter 1-6 from the Percent Calculator Menu ***")
            menu_select()
            continue
        if select < 1 or select > 5:
            print("\n*** Invalid Selection: Please enter 1-6 from the Percent Calculator Menu ***")
            menu_select()
            continue
        if select == 1:
            percent_calc()
        elif select == 2:
            numerator_calculator()
        elif select == 3:
            denominator_calculator()
        elif select == 4:
            menu_select()
        elif select == 5:
            sys.exit("\nThank you, have a nice day!")

def percent_calc():  # Create Base for EACH as well as structured visual of formula
    print("\n--------------------------------")
    print("    Percent Calculator          ")
    print("--------------------------------\n")
    while True:
        print(" num?     ?")
        print("----- = -----")
        print(" dom?   base?\n")
        try:
            num = float(input("Dollar Numerator Amount: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if num < 0:
            print("\n*** Invalid Number ***\n")
            continue
        try:
            dom = float(input("Dollar Denominator Amount: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if dom < 0:
            print("\n*** Invalid Number ***\n")
            continue
        try:
            base = float(input("Percentage Base (e.g. 100 is typical or use a special case like 95): "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if base < 0:
            print("\n*** Invalid Number ***\n")
            continue
        cross_multiply = num * base
        print(f"\nThe percentage of {num}/{dom} is: >>>", format(cross_multiply/dom, ',.2f') + "% <<<")
        percent_calc_menu()

def numerator_calculator():
    print("\n--------------------------------")
    print("    Numerator Calculator        ")
    print("--------------------------------\n")
    while True:
        print("  ?      per")
        print("----- = -----")
        print(" dom?   base?\n")
        try:
            dom = float(input("Denominator Amount: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if dom < 0:
            print("\n*** Invalid Number ***\n")
            continue
        try:
            per = float(input("Percentage: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if per < 0:
            print("\n*** Invalid Number ***\n")
            continue
        try:
            base = float(input("Percentage Base (e.g. 100 is typical or use a special case like 95): "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if base < 0:
            print("\n*** Invalid Number ***\n")
            continue
        cross_multiply = dom * per / base
        print(f"\n{per}% of ${dom} is >>> $" + format(cross_multiply, ',.2f'), "<<<\n")
        percent_calc_menu()

def denominator_calculator():
    print("\n--------------------------------")
    print("    Denominator Calculator      ")
    print("--------------------------------\n")
    while True:
        print(" num?    per?")
        print("----- = -----")
        print("  ?     base?\n")
        try:
            num = float(input("Numerator Amount: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if num < 0:
            print("\n*** Invalid Number ***\n")
            continue
        try:
            per = float(input("Percentage Amount: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if per < 0:
            print("\n*** Invalid Number ***\n")
            continue
        cross_multiply = num * 100
        print("Denominator Dollar Amount: >>> $" + format(cross_multiply/per, ',.2f'), "<<<\n")
        percent_calc_menu()

def calc():
    n = 0
    l = 0
    print("")
    while True:
        try:
            p = float(input("Investment Amount: "))
            a = p
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if p < 0:
            print("\n*** Invalid Number ***\n")
            continue

        try:
            r = float(input("Interest: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if r < 0:
            print("\n*** Invalid Number ***\n")
            continue

        try:
            limit = float(input("Goal Amount: "))
        except ValueError:
            print("\n*** Invalid Number ***\n")
            continue
        if limit < 0 or limit > 10000000:
            print("\n*** Invalid Number ***\n")
            continue
        else:
            print("")
            recursion_calculator(p, r, n, a, l, limit)


def recursion_calculator(p, r, n, a, l, limit):
    """Compounds percentages to principal"""
    e = l + 1
    w = n + 1
    og = p+(p*r/100)
    if og < limit:
        n = w
        change = og - p
        p = og
        print("Trade #" + str(n) + ': $' + format(og, ',.2f'), "Change: " + format(change, ',.2f'))
        l = e
        if e == 3:
            print("--------------------------------------------\n")
            l = 0
        recursion_calculator(p, r, n, a, l, limit)
    elif og == limit or og > limit:
        print("--------------------------------------------")
        print("Amount Invested: $" + format(a, ',.2f'))
        print("Compounding Interest:", format(r, ',.2f') + "%")
        print("Final Dollar Amount Trade", str(w) + ": $" + format(og, ',.2f'))
        print("--------------------------------------------\n")
        main_menu_reset()


def main_menu_reset():
    """Allows user to go back to the main menu or recalculate"""
    while True:
        try:
            answer = input("Recalculate(R) or Main Menu(M)? ")
            answer = answer.capitalize()
        except ValueError:
            print("\n*** Must be Recalculate(R) or Main Menu(M) ***\n")
            continue
        r = "R"
        m = "M"
        x = [r, m]
        if answer not in x:
            print("\n*** Must be Recalculate(R) or Main Menu(M) ***\n")
            continue
        else:
            if answer == m:
                menu_select()
            elif answer == r:
                calc()


menu_select()

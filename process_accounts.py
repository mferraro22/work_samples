# ==========================================================================
# PROGRAM:... ....... Assignment 03 - Python Classes and Objects
# AUTHOR:............ Matthew Ferraro
# COURSE:............ CSC 231
# TERM:.............. Fall 2020
# ==========================================================================
class BankAccount:
    """Class that helps compute bank account information"""
    def __init__(self, account, first, last, balance):
        self.account_number = account
        self.first_name = first
        self.last_name = last
        self.account_balance = float(balance)

    def __eq__(self, other):
        return self.account_number == other.account_number and self.first_name == other.first_name and \
               self.last_name == other.last_name and self.account_balance == other.account_balance

    def __repr__(self):
        return f"Account({self.account_number}, {self.first_name}, {self.last_name}, {self.account_balance})"

    def __str__(self):
        return f"Account: {self.account_number} {self.first_name} {self.last_name}, {self.account_balance}"

    def calculate_interest(self, rate):
        return self.account_balance * rate


bank_list = []
with open("accounts.csv", "r") as bank_file:
    next(bank_file)
    for items in bank_file:
        lines = items.strip().split(",")
        bank_list.append(BankAccount(lines[0], lines[1], lines[2], lines[3]))

count = len(bank_list)
acct_sum = 0
acct_with_int = 0
max_acct = 0
max_bank_acct = BankAccount("", "", "", 0)
accounts_with_interest = []

for acct in bank_list:
    acct_sum += acct.account_balance
    acct_with_int = acct.account_balance + acct.calculate_interest(0.015)
    accounts_with_interest.append(f"{acct.account_number}, {acct.first_name}, {acct.last_name}, {acct_with_int:.2f}")
    if max_acct < acct_with_int:
        max_acct = acct_with_int
        max_bank_acct.account_number = acct.account_number
        max_bank_acct.first_name = acct.first_name
        max_bank_acct.last_name = acct.last_name
        max_bank_acct.account_balance = acct_with_int

avg = acct_sum/count  # 1 Uses BankAccount object above
print("Number of accounts:", count)
print("Average balance: $" + format(avg, ",.2f"))
print("Largest balance with interest: ", max_bank_acct.account_number + ",", max_bank_acct.first_name + ",",
      max_bank_acct.last_name + ", $" + format(max_bank_acct.account_balance, ",.2f"))
print("Average balance with interest: $" + format(avg + (avg * 0.015), ",.2f"))

with open("accounts_with_interest.csv", "w") as interest_file:
    interest_file.write("AccountNumber, FirstName, LastName, AccountBalance\n")
    for items in accounts_with_interest:
        interest_file.write(f"{items}\n")

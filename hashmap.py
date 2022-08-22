"""
PROGRAM:........... hashmap extra credit
AUTHOR:............ <Ferraro>, <Matthew>
COURSE:............ CSC 231 801-803
TERM:.............. Fall 2020
"""
import copy


class HashMap:
    def __init__(self, size=9):
        self.keys = [None] * size
        self.values = [None] * len(self.keys)
        self.count = 0

    def __len__(self):
        return self.count

    def __contains__(self, key):
        if key in self.keys:
            return True
        else:
            return False

    def hash(self, key):
        return int(key.replace("-", "")) % len(self.keys)

    def rehash(self, prev_hash):
        return (prev_hash + 1) % len(self.keys)

    def resize(self):
        self.count = 0
        new_keys = copy.deepcopy(self.keys)
        new_values = copy.deepcopy(self.values)
        self.keys = [None] * len(self.keys) * 2
        self.values = [None] * len(self.keys) * 2
        for location in range(0, len(new_keys)):
            if new_keys[location] is not None:
                self.__setitem__(new_keys[location], new_values[location])

    def __setitem__(self, key, value):
        load_size = self.count / len(self.keys)
        if load_size > 0.66:
            self.resize()
        index = self.hash(key)
        if self.keys[index] is None:
            self.keys[index] = key
            self.values[index] = value
            self.count += 1
        else:
            if self.keys[index] == key:
                self.values[index] = value
            else:
                next_slot = self.rehash(index)
                while self.keys[next_slot] is not None and self.keys[next_slot] != key:
                    next_slot = self.rehash(next_slot)
                if self.keys[next_slot] is None:
                    self.keys[next_slot] = key
                    self.values[next_slot] = value
                    self.count += 1
                else:
                    self.values[next_slot] = value

    def __getitem__(self, key):
        start_slot = self.hash(key)
        value = None
        found = False
        stop = False
        position = start_slot
        while self.keys[position] is not None and not found and not stop:
            if self.keys[position] == key:
                found = True
                value = self.values[position]
            else:
                position = self.rehash(position)
                if position == start_slot:
                    stop = True
        return value


# if __name__ == "__main__":
#     from hashmap_test import TestSuite
#     suite = TestSuite()
#     suite.test_all()

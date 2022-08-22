# ==========================================================================
# PROGRAM:... ....... Assignment 11
# AUTHOR:............ <Ferraro>, <Matthew>
# COURSE:............ CSC 231
# TERM:.............. Fall 2020
# ==========================================================================


class TreeNode:
    """
    Do not change any existing code in the TreeNode class.
    """
    def __init__(self, key=None, value=None):
        self.key = key
        self.value = value
        self.left = None
        self.right = None

    def __repr__(self):
        return f"TreeNode({self.key}, {self.value})"


class TreeMap:
    """
    The TreeMap data type implements the Map ADT (like a Python dictionary), e.g., tree[850123456]='Mike'
    The data structure is a binary search tree. Each node in the tree (a TreeNode) contains a key and a value.
    The keys are used to organize the tree. Examine the TreeNode's keys when inserting, searching, deleting, etc.,
    The values in each TreeNode are the data associated with the keys.
    """

    def __init__(self):
        self.size = 0
        self.root = None
        self.track_min_max = None
        self.count_height = 0
        self.track_height = 0
        self.level = []

    def __len__(self):
        """
        :return: the number of nodes in the TreeMap. This algorithm must have a O(1) implementation.
        """
        return self.size

    def insert(self, curr, key, value):
        """
        Insert data into the TreeMap. This method must be recursive.
        When the key to insert already exists in the TreeMap, replace the existing TreeNode's value with 'value'.
        """
        if key < curr.key:
            if curr.left is None:
                curr.left = TreeNode(key, value)
                self.size += 1
            else:
                self.insert(curr.left, key, value)
        elif key > curr.key:
            if curr.right is None:
                curr.right = TreeNode(key, value)
                self.size += 1
            else:
                self.insert(curr.right, key, value)
        else:
            curr.value = value

    def __setitem__(self, key, value):
        """
        Support a call of the form tree[850123456]='Mike'. Make a call to the insert() method to do the actual
        insert. Also, handle the special case where the TreeMap is empty.
        """
        if self.root is None:
            self.root = TreeNode(key, value)
            self.size += 1
        else:
            self.insert(self.root, key, value)

    def find(self, curr, key):
        """
        Find the key in the TreeMap and return its associated value. This method must be recursive.
        Raise a KeyError if the key is not in the TreeMap.
        """
        if curr is None:
            raise KeyError
        elif curr.key == key:
            return curr.value
        elif key < curr.key:
            return self.find(curr.left, key)
        else:
            return self.find(curr.right, key)

    def __getitem__(self, key):
        """
        Support a call of the form 'x = tree[850123456]'. Make a call to the find() method to do the work.
        Raise a KeyError if the tree is empty.
        """
        if self.size == 0:
            raise KeyError
        elif self.root:
            if self.find(self.root, key):
                return self.find(self.root, key)
            else:
                return None
        else:
            return None

    def __contains__(self, item):
        """
        Support a call of the form 'x in tree'. Return True if x is a key in the tree, False otherwise.
        """
        try:
            self.find(self.root, item)
            return True
        except KeyError:
            return False

    def _locate_node(self, key):
        """
        Find a node in the TreeMap based on the key.
        Return three values:
        - found: True if the key was found in the TreeMap, False otherwise.
        - curr: the TreeNode containing the key
        - parent: the parent of the TreeNode containing the key
        :param key:
        :return:
        """
        found = False
        curr = self.root
        parent = None
        while curr is not None and not found:
            if key == curr.key:
                found = True
            elif key > curr.key:
                parent = curr
                curr = curr.right
            else:
                parent = curr
                curr = curr.left
        return found, curr, parent

    def _find_inorder_successor(self, node):
        """
        Return the in-order successor of a node, i.e., the node's leftmost right descendant, and that successors'
        parent.
        This method should ONLY be called on a node with both a left and a right child.
        Return the entire TreeNode objects.
        """
        curr = node.right
        parent = node
        while curr.left is not None:
            parent = curr
            curr = curr.left
        return curr, parent

    def __delitem__(self, key):
        """
        Support a call of the form 'del tree[850123456]'. Remove the node containing the key per the procedure
        discussed in class for deleting nodes from a BST.
        - Raise a KeyError if the key is not in the TreeMap.
        - You will need to use the _locate_node() and _find_inorder_successor() supporting methods.
        """
        if self.size > 1:
            if self._locate_node(key):
                self.remove(self._locate_node(key))
                self.size -= 1
            else:
                raise KeyError
        elif self.size == 1 and self.root.key == key:
            self.root = None
            self.size -= 1
        else:
            raise KeyError

    def remove(self, target):
        if not target[0]:
            raise KeyError
        elif target[1].left is None and target[1].right is None:  # leaf
            if target[1] == target[2].left:
                target[2].left = None
            else:
                target[2].right = None
        elif target[1].left is not None and target[1].right is not None:  # two children
            successor = self._find_inorder_successor(target[1])
            if successor[0].left is None and successor[0].right is None:
                if successor[0] == successor[1].left:
                    successor[1].left = None
                else:
                    successor[1].right = None
            elif successor[0].left is not None or successor[0].right is not None:
                if successor[0].left is not None:
                    if successor[0] == successor[1].left:
                        successor[1].left = successor[0].left
                    else:
                        successor[1].right = successor[0].left
                    successor[1].left = successor[1]
                else:
                    if successor[0] == successor[1].left:
                        successor[1].left = successor[0].right
                    else:
                        successor[1].right = successor[0].right
                    successor[1].right = successor[1]
            target[1].key = successor[0].key
            target[1].value = successor[0].value
        else:  # one child
            if target[1].left is not None:
                if target[1] == target[2].left:
                    target[2].left = target[2]
                    target[2].left = target[1].left
                elif target[1] == target[2].right:
                    target[2].right = target[2]
                    target[2].right = target[1].left
                else:
                    if target[1].left is not None:
                        target[2].left = target[1]
                    if target[1].right is not None:
                        target[2].right = target[1]
            else:
                if target[1] == target[2].left:
                    target[2].left = target[2]
                    target[2].left = target[1].right
                elif target[1] == target[2].right:
                    target[2].right = target[2]
                    target[2].right = target[1].right
                else:
                    if target[1].left is not None:
                        target[2].left = target[1]
                    if target[1].right is not None:
                        target[2].right = target[1]

    def traverse_inorder(self, node=None):
        """
        Perform an in-order traversal of the TreeMap to print each TreeNode. Note that __str__ is already defined
        for TreeNodes.
        - Do not print anything if the TreeMap is empty.
        """
        if self.root is None:
            return
        if node is None:
            curr = self.root
        else:
            curr = node
        if curr.left is not None:
            self.traverse_inorder(curr.left)
        print(curr)
        if curr.right is not None:
            self.traverse_inorder(curr.right)

    def traverse_preorder(self, node=None):
        """
        Perform a preorder traversal of the TreeMap to print each TreeNode. Do not print anything if the TreeMap is
        empty.
        """
        if self.root is None:
            return
        if node is None:
            curr = self.root
        else:
            curr = node
        print(curr)
        if curr.left is not None:
            self.traverse_preorder(curr.left)
        if curr.right is not None:
            self.traverse_preorder(curr.right)

    def traverse_postorder(self, node=None):
        """
        Perform a postorder traversal of the TreeMap to print each TreeNode. Do not print anything if the TreeMap is
        empty.
        """
        if self.root is None:
            return
        if node is None:
            curr = self.root
        else:
            curr = node
        if curr.left is not None:
            self.traverse_postorder(curr.left)
        if curr.right is not None:
            self.traverse_postorder(curr.right)
        print(curr)

    def keys(self, node=None, a_list=None):
        """
        Return a list of the keys in the TreeMap. Return an empty list if the TreeMap is empty.
        This method must be recursive.
        """
        if self.root is None:
            return []
        if node is None and a_list is None:
            a_list = []
            node = self.root
        a_list.append(node.key)
        if node.left is not None:
            self.keys(node.left, a_list)
        if node.right is not None:
            self.keys(node.right, a_list)
        return a_list

    def values(self, node=None, a_list=None):
        """
        Return a list of the values in the TreeMap. Return an empty list if the TreeMap is empty.
        This method must be recursive.
        """
        if self.root is None:
            return []
        if node is None and a_list is None:
            a_list = []
            node = self.root
        a_list.append(node.value)
        if node.left is not None:
            self.values(node.left, a_list)
        if node.right is not None:
            self.values(node.right, a_list)
        return a_list

    def height(self):
        """
        Return the height of the tree. Raise a ValueError if the TreeMap is empty.
        You may find it useful to implement a helper method that is recursive.
        """
        if self.size == 0:
            raise ValueError
        else:
            self.helper_height()
            return self.track_height

    def helper_height(self, node=None):
        if node is None:
            curr = self.root
        else:
            curr = node
        if curr.left is not None:
            self.count_height += 1
            self.helper_height(curr.left)
        if self.count_height > self.track_height:
            self.track_height = self.count_height
        if curr.right is not None:
            self.count_height += 1
            self.helper_height(curr.right)
        self.count_height = 0

    def find_min(self):
        """
        Return the minimum key in the tree. Raise a ValueError if the TreeMap is empty.
        """
        if self.size == 0:
            raise ValueError
        else:
            self.helper_min()
            return self.track_min_max.key

    def helper_min(self, node=None):
        if node is None:
            curr = self.root
            self.track_min_max = curr
        else:
            curr = node
        if curr.left is not None:
            self.helper_min(curr.left)
        if curr.key < self.track_min_max.key:
            self.track_min_max = curr
            print(self.track_min_max)
        if curr.right is not None:
            self.helper_min(curr.right)

    def find_max(self):
        """
        Return the maximum key in the tree. Raise a ValueError if the TreeMap is empty.
        """
        if self.size == 0:
            raise ValueError
        else:
            self.helper_max()
            return self.track_min_max.key

    def helper_max(self, node=None):
        if node is None:
            curr = self.root
            self.track_min_max = curr
        else:
            curr = node
        if curr.left is not None:
            self.helper_max(curr.left)
        if curr.key > self.track_min_max.key:
            self.track_min_max = curr
            print(self.track_min_max)
        if curr.right is not None:
            self.helper_max(curr.right)

    def traverse_levelorder(self):
        """
        EXTRA CREDIT:
        Perform a level-order traversal of the TreeMap to print each TreeNode. Do not print anything if the TreeMap
        is empty.
        Starting with the root, level-order order traversal goes level-by-level, left-to-right.
        """
        if self.size == 0:
            return
        else:
            self.helper_level()

    def helper_level(self, node=None):
        level = self.level
        if node is None:
            curr = self.root
        else:
            curr = node
        self.level.append(curr)
        while len(level) > 0:
            print(level[0])
            curr = level.pop(0)
            if curr.left is not None:
                level.append(curr.left)
            if curr.right is not None:
                level.append(curr.right)

    # used site below as an assist for level order traversal, all others solved independently
    # level-order traversal previously solved independently with Big O n^2 log(2) n which included similarities
    # attempt at Big O(1 or n) recursively was very close, but ultimately discarded
    # https://stephanosterburg.gitbook.io/scrapbook/coding/python/breadth-first-search/level-order-tree-traversal

    # CODE BELOW WAS The INITIAL WORKING ATTEMPT OF BIG O(n^2 log(2) n) using the insert for height and leve-lorder
    # self.level_dictionary = {}  added to constructor
    # def insert(self, curr, key, value):
    #     self.level_dictionary[0] = [self.root]
    #     if key < curr.key:
    #         if curr.left is None:
    #             curr.left = TreeNode(key, value)
    #             self.count_height += 1
    #             if self.count_height not in self.level_dictionary.keys():
    #                 self.level_dictionary[self.count_height] = [curr.left]
    #             else:
    #                 self.level_dictionary[self.count_height].append(curr.left)
    #             self.track_height.append(self.count_height)
    #             self.count_height = 0
    #             self.size += 1
    #         else:
    #             self.count_height += 1
    #             self.insert(curr.left, key, value)
    #     elif key > curr.key:
    #         if curr.right is None:
    #             curr.right = TreeNode(key, value)
    #             self.count_height += 1
    #             if self.count_height not in self.level_dictionary.keys():
    #                 self.level_dictionary[self.count_height] = [curr.right]
    #             else:
    #                 self.level_dictionary[self.count_height].append(curr.right)
    #             self.track_height.append(self.count_height)
    #             self.count_height = 0
    #             self.size += 1
    #         else:
    #             self.count_height += 1
    #             self.insert(curr.right, key, value)
    #     else:
    #         curr.value = value
    #
    # def traverse_level order(self): (Remove space in level order)
    #
    #     if self.size == 0:
    #         return
    #     else:
    #         for levels in self.level_dictionary.values():
    #             for nodes in levels:
    #                 print(nodes)


def main():
    # You may comment out the calls to the test_xxx() functions to reduce the amount printed to the screen as you work.
    # Uncomment them when you are ready to test.

    # You may add other code here to help you test and debug your code as you see fit.

    from treemap_tests import TestSuite
    import sys
    suite = TestSuite(sys.modules[__name__])
    suite.test_01_constructor()
    suite.test_02_setitem_doesnt_explode()
    suite.test_03_getitem_keyerrors()
    suite.test_04_setitem_and_getitem()
    suite.test_05_len()
    suite.test_06_contains()
    suite.test_07_delitem()
    suite.test_08_inorder_traversal()
    suite.test_09_preorder_traversal()
    suite.test_10_postorder_traversal()
    suite.test_11_keys()
    suite.test_12_values()
    suite.test_13_height()
    suite.test_14_find_min()
    suite.test_15_find_max()
    suite.test_EXTRA_CREDIT_levelorder_traversal()
    if not suite.suite_passed:
        print('\u2717' * 5, "One or more tests in the test suite failed.")
    print(f">>> You have currently passed {suite.tests_passed}/{suite.test_count} tests.")


if __name__ == '__main__':
    main()

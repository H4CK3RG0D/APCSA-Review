# 4

---
Consider a program that maintains a list of integers using an ArrayList. The list is initially empty, and the program provides the following methods:

`public void addElement(int element)` - Adds the given element to the end of the list.
`public void removeElement(int index)` - Removes the element at the specified index from the list.
`public int getElement(int index)` - Returns the element at the specified index.
`public int size()` - Returns the number of elements in the list.

Write the implementation of the following method:

`public int[] removeDuplicates()`

The method should remove any duplicate elements from the list and return an array of the remaining elements, in the order they appear in the list. For example, if the list contains [1, 2, 3, 2, 4], the method should modify the list to contain [1, 2, 3, 4] and return the array [1, 2, 3, 4].
You may assume that the list contains only positive integers. You may also assume that the ArrayList class is available and imported for use in your program. Your implementation should not create any additional data structures other than the ArrayList and the array to be returned.

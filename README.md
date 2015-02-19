# SortedListArrayBased
COSC 1437 Homework


**Topics**
* Throughout this lab, we want to practice abstract data type (ADT).
* In particular, this lab asks you to implement a SortedListArrayBased class, which extends ListArrayBased class that implements ListInterface.
* NOTE: After we learn Ch.5, you will be asked to implement another SortedListReferenceBased class, which will extends “ListReferenceBased” class that implements “ListInterface”. To be more specific, it will be reference-based (i.e., singly-linked-list-based).

* Start with the following supportive files (“ListException.java”, “ListIndexOutOfBoundsException.java”, “ListInterface.java”, “ListArrayBased.java”, “SortedListArrayBasedDriver.java”, and “SortedListArrayBased.java).
* The first five java files are complete, thus use them as they are provided. You’re asked to show your work on the java file, “SortedListArrayBased.java”.
* Remember that in Chapter 4, “ListArrayBased.java” implements “ListInterface”. In this lab, “SortedListArrayBased” extends “ListArrayBased.
* In class, we discussed an example of interface on shopping list (refer to the textbook and the lecture note). Required implementation description/requirement of each method is given in “SortedListArrayBased.java”.
* Note that you should keep the sorted (say, non-decreasing) order of items in the array, while adding an item using “add()”. Also, make sure you make shift left (or right) properly upon inserting (i.e., adding) (or deleting (i.e., removing)) an item to (or from) the array. Keeping the sorted order in the array is the key in this lab.
* Note that index starts from 0, not 1. Therefore, the valid index ranges from 0 to size()-1.

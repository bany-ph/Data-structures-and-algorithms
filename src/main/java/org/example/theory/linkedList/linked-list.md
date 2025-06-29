

# 🟦 **LinkedList in Java**

A **LinkedList** is a linear data structure where elements (nodes) are stored in separate objects, and each element points to the next (and previous, if doubly linked).

In Java, `LinkedList` is part of the `java.util` package and:

✅ Implements the **`List`**, **`Deque`**, and **`Queue`** interfaces.
✅ Supports **dynamic size**, unlike arrays.
✅ Allows fast insertions and deletions at both ends.
✅ Allows duplicate elements.

---

# 🛠️ **Most Common Methods**

| Method                | Description                                            |
| --------------------- | ------------------------------------------------------ |
| `add(E e)`            | Adds element to the end of the list.                   |
| `add(int index, E e)` | Inserts element at a specific position.                |
| `remove()`            | Removes the first element (as `Queue`).                |
| `remove(int index)`   | Removes element at a specific position.                |
| `remove(Object o)`    | Removes the first occurrence of the specified element. |
| `get(int index)`      | Returns the element at the specified position.         |
| `set(int index, E e)` | Replaces the element at the specified position.        |
| `size()`              | Returns the number of elements in the list.            |
| `isEmpty()`           | Checks if the list is empty.                           |
| `clear()`             | Removes all elements.                                  |
| `contains(Object o)`  | Checks if the list contains a specific element.        |

---

# 🟣 **Additional Useful Methods**

| Method                  | Description                                                                    |
| ----------------------- | ------------------------------------------------------------------------------ |
| `addFirst(E e)`         | Adds an element to the beginning of the list.                                  |
| `addLast(E e)`          | Adds an element to the end of the list.                                        |
| `removeFirst()`         | Removes the first element.                                                     |
| `removeLast()`          | Removes the last element.                                                      |
| `getFirst()`            | Returns the first element (throws exception if empty).                         |
| `getLast()`             | Returns the last element (throws exception if empty).                          |
| `indexOf(Object o)`     | Returns the index of the first occurrence of the element, or -1 if not found.  |
| `lastIndexOf(Object o)` | Returns the index of the last occurrence of the element, or -1 if not found.   |
| `offer(E e)`            | Adds an element to the end (as a `Queue`).                                     |
| `poll()`                | Retrieves and removes the first element, or returns `null` if empty.           |
| `peek()`                | Retrieves, but does not remove, the first element, or returns `null` if empty. |

---

# 🔧 **When to Use LinkedList**

✅ Frequent insertions or deletions at the beginning or end.
✅ When you need both `List` and `Queue` behavior.
✅ If random access is not a priority (use `ArrayList` if you need fast random access).


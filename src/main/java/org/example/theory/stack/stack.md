
# 🟦 **Stack - Concept**

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.

The last element added to the stack is the first one to be removed.

---

# 🗂️ **Stack in Java**

In Java, the **`Stack`** class is part of the `java.util` package. It extends `Vector` and provides stack-specific operations.

---

# 🛠️ **Most Used Stack Methods**

| Method             | Description                                                                       |
| ------------------ | --------------------------------------------------------------------------------- |
| `push(E item)`     | Adds an element to the top of the stack.                                          |
| `pop()`            | Removes and returns the element at the top of the stack.                          |
| `peek()`           | Returns the element at the top of the stack without removing it.                  |
| `isEmpty()`        | Checks whether the stack is empty.                                                |
| `size()`           | Returns the number of elements in the stack.                                      |
| `search(Object o)` | Returns the 1-based position of an element from the top; returns -1 if not found. |

---

# 🟣 **Key Properties**

✅ LIFO behavior: last element added is removed first.
✅ Used for operations where reverse order is required.
✅ Internally based on a dynamic array (since it extends `Vector`).

---

# 🔧 **Common Applications**

* Undo/Redo operations
* Backtracking algorithms
* Expression evaluation (e.g., parentheses matching)
* Reversing data structures

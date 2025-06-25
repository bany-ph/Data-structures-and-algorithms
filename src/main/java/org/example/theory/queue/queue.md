
# 🟦 **Queue - Concept**

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.

The first element added to the queue is the first one to be removed.

---

# 🗂️ **Queue in Java**

In Java, **`Queue`** is an interface from the `java.util` package.
It is commonly implemented by classes like **`LinkedList`** or **`PriorityQueue`**.

---

# 🛠️ **Queue Methods**

| Method       | Description                                                                     |
| ------------ | ------------------------------------------------------------------------------- |
| `add(E e)`   | Adds an element to the queue. Throws an exception if full.                      |
| `offer(E e)` | Adds an element to the queue. Returns `false` if full (preferred).              |
| `remove()`   | Removes and returns the head of the queue. Throws exception if empty.           |
| `poll()`     | Removes and returns the head of the queue. Returns `null` if empty.             |
| `element()`  | Retrieves the head of the queue without removing it. Throws exception if empty. |
| `peek()`     | Retrieves the head of the queue without removing it. Returns `null` if empty.   |

---

# 🟣 **Key Properties**

✅ FIFO behavior: first element added is removed first.

✅ Often used with `LinkedList` or `PriorityQueue`.

✅ Suitable for task scheduling, buffering, or managing ordered processes.

---

# 🔧 **Common Applications**

* Task queues
* Print queues
* Order processing systems
* Breadth-First Search (BFS) in trees and graphs


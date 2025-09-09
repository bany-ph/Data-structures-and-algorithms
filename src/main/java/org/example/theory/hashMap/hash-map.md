# Hash Map

## Useful links
### websites:
 - [Guide to Java HashMap](https://www.baeldung.com/java-hashmap)
 - [iterate HashMap]([https://www.baeldung.com/java-iterate-map])
 - [A guide to EnumMap](https://www.baeldung.com/java-enum-map)
 - [Comparing two HashMaps](https://www.baeldung.com/java-compare-hashmaps)
 - [¿Qué Es Un HashMap en Java?](https://nubecolectiva.com/blog/que-es-un-hashmap-en-java/)

### videos:
- [HashMaps In 10 minutes](https://youtu.be/NMHk1CGb28o?si=nMGHhk4jS2RgKoQj)
--- 

# Basic Methods
| Method                        | Description                                                 |
| ----------------------------- | ----------------------------------------------------------- |
| `put(K key, V value)`         | Adds or updates a key-value pair in the map                 |
| `get(Object key)`             | Retrieves the value for a given key, or `null` if not found |
| `remove(Object key)`          | Removes the mapping for a key if it exists                  |
| `containsKey(Object key)`     | Returns `true` if the map contains the specified key        |
| `containsValue(Object value)` | Returns `true` if the map contains the specified value      |
| `size()`                      | Returns the number of key-value mappings                    |
| `isEmpty()`                   | Returns `true` if the map contains no mappings              |
| `clear()`                     | Removes all mappings from the map                           |

# Iteration access
| Method                | Description                                    |
| --------------------- | ---------------------------------------------- |
| `keySet()`            | Returns a `Set` view of all keys               |
| `values()`            | Returns a `Collection` view of all values      |
| `entrySet()`          | Returns a `Set` of key-value `Map.Entry` pairs |
| `forEach(BiConsumer)` | Performs an action for each entry              |

# Utility and default methods
| Method                                   | Description                                             |
| ---------------------------------------- | ------------------------------------------------------- |
| `getOrDefault(Object key, V defaultVal)` | Returns value if key exists, else returns default value |
| `putIfAbsent(K key, V value)`            | Adds a key-value only if key is not already present     |
| `replace(K key, V newValue)`             | Replaces the value for a given key if it exists         |
| `replace(K key, V oldValue, V newValue)` | Replaces the value only if it matches the old value     |
| `compute(K key, BiFunction)`             | Updates value for a key using a function                |
| `computeIfAbsent(K key, Function)`       | Computes and adds value if key is missing               |
| `computeIfPresent(K key, BiFunction)`    | Computes new value if key exists                        |
| `merge(K key, V value, BiFunction)`      | Merges value with existing one using a function         |

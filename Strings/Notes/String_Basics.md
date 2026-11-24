# Java DSA Notes — Strings (Part 1)

## 1. What is a String?

A **String is a sequence of characters** used to store text in Java.

Examples:
```java
String name = "Eshwar";
String language = "Java";
String message = "Hello World";
```

**Important points:**
- Strings are written inside double quotes (`" "`).
- `String` is a class in Java, not a primitive data type.
- A String can contain letters, digits, spaces, and special characters.
- Strings in Java are immutable (their contents cannot be changed after creation).

## 2. String Declaration and Initialization

**Syntax:**
```java
String variableName = "value";
```

**Example:**
```java
String name = "Eshwar";
System.out.println(name);
```

**Output:**
```text
Eshwar
```

Explanation:
- `String` — class used to represent text.
- `name` — variable name.
- `=` — assignment operator.
- `"Eshwar"` — String value.

## 3. Difference Between char and String

| char | String |
|---|---|
| Primitive data type | Class (reference type) |
| Stores a single character | Stores a sequence of characters |
| Uses single quotes | Uses double quotes |
| Example: `'A'` | Example: `"Apple"` |

```java
char ch = 'A';
String str = "A";
```

**Remember:** `'A'` is a char, whereas `"A"` is a String.

## 4. String Indexing

Every character in a String has an index starting from **0**.

Example:
```java
String str = "JAVA";
```

| Character | J | A | V | A |
|---|---|---|---|---|
| Index | 0 | 1 | 2 | 3 |

Important:
- First index = `0`
- Last index = `length() - 1`
- Total characters = `length()`

## 5. String length() Method

The `length()` method returns the total number of characters in a String.

**Syntax:**
```java
str.length();
```

**Example:**
```java
String str = "COMPUTER";
System.out.println(str.length());
```

**Output:**
```text
8
```

Explanation: COMPUTER contains 8 characters, but its last index is 7.

**Formula:**
```text
Last Index = str.length() - 1
```

## 6. String charAt() Method

The `charAt()` method returns the character at a specified index.

**Syntax:**
```java
str.charAt(index);
```

**Example:**
```java
String str = "JAVA";

System.out.println(str.charAt(0));
System.out.println(str.charAt(2));
```

**Output:**
```text
J
V
```

**Important:** Accessing an invalid index causes `StringIndexOutOfBoundsException`.

## 7. Difference Between String and Array

| Operation | String | Array |
|---|---|---|
| Length | `str.length()` | `arr.length` |
| Access element | `str.charAt(i)` | `arr[i]` |
| Last index | `str.length()-1` | `arr.length-1` |

## 8. String Traversal Using for Loop

**Traversal means visiting each character of a String one by one.**

```java
class Main {
    public static void main(String[] args) {

        String str = "JAVA";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
```

**Output:**
```text
J
A
V
A
```

### Dry Run

| Iteration | i | Condition | Character |
|---|---|---|---|
| 1 | 0 | 0 < 4 (true) | J |
| 2 | 1 | 1 < 4 (true) | A |
| 3 | 2 | 2 < 4 (true) | V |
| 4 | 3 | 3 < 4 (true) | A |
| 5 | 4 | 4 < 4 (false) | Loop stops |

### Time and Space Complexity

- **Time Complexity: O(n)** — the loop visits all n characters.
- **Auxiliary Space Complexity: O(1)** — only one loop variable is used, excluding output storage.

## 9. Practice Questions

1. Declare a String and print its value.
2. Find the length of `"PROGRAMMING"`.
3. Print the first character of `"COMPUTER"`.
4. Print the last character of `"JAVA"` using `length()`.
5. Print every character of `"CODE"` using a for loop.
6. Print the characters of `"HELLO"` on the same line separated by spaces.

## 10. Key Points for Revision

- `String` is a class in Java.
- Strings use double quotes.
- Indexing starts at 0.
- `length()` returns the number of characters.
- `charAt(i)` returns the character at index `i`.
- Last index = `length() - 1`.
- A for loop can traverse a String in O(n) time.
- Strings are immutable in Java.

**DSA Pattern Learned:** String Traversal

**Next Topic:** Reverse String Traversal.
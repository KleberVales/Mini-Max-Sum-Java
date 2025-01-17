# 📌 Mini-Max Sum Challenge with Java

## 📝 Challenge Description

The Mini-Max Sum challenge requires finding the minimum and maximum sums possible by adding exactly four out of five given integers.

## 📥 Input

* A single line containing five space-separated integers.

## 📤 Output

- Two space-separated integers:
  * Minimum sum (sum of the smallest four numbers).
  * Maximum sum (sum of the largest four numbers).

## ✅ Example

### Input:
``` java

1 2 3 4 5

```
### Output:
``` java

10 14

```
## 🔍 Explanation
- Given the numbers: 1, 2, 3, 4, 5
- Possible sums of four numbers:
  * Excluding 1: 2 + 3 + 4 + 5 = 14
  * Excluding 2: 1 + 3 + 4 + 5 = 13
  * Excluding 3: 1 + 2 + 4 + 5 = 12
  * Excluding 4: 1 + 2 + 3 + 5 = 11
  * Excluding 5: 1 + 2 + 3 + 4 = 10

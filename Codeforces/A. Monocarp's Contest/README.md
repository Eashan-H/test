# A. Monocarp's Contest

**Problem:** [A. Monocarp's Contest](https://codeforces.com/contest/2260/problem/A)

| Detail | Value |
|--------|-------|
| **Rating** | 0 |
| **Time Limit** | 2s |
| **Memory Limit** | 512 MB |
| **Language** | java 21,java 17,java 11,java |

**Tags:** `implementation`

---

## Problem Statement

A. Monocarp's Contest
time limit per test
2 seconds
memory limit per test
512 megabytes
input
standard input
output
standard output

Monocarp is preparing a team programming contest. The contest has nn problems, each of which is either easy or hard. The problems are numbered from 11 to nn.

Monocarp wants the first and the last problems of the contest to be easy. In one operation, he can choose any two problems and swap them.

Determine the minimum number of operations required to make the first and the last problems easy, or report that it is impossible.

Input
The first line contains an integer tt (1≤t≤1031 \le t \le 10^3) — the number of test cases.

Each test case consists of two lines

 -  the first line contains one integer nn (2≤n≤502 \le n \le 50) — the number of problems in the contest; 
-  the second line contains nn integers a1,a2,…,ana_1, a_2, \ldots, a_n (0≤ai≤10 \le a_i \le 1). If ai=0a_i=0, then the problem with number ii is easy; if ai=1a_i=1, then it is hard. 

Output
For each test case, print the minimum number of operations required to make the first and the last problems easy. If it is impossible to satisfy the requirement, print −1-1.

Example
InputCopy

4
2
0 0
2
0 1
6
1 0 0 1 0 0
5
1 0 0 1 1

OutputCopy

0
-1
1
2

Note
In the first test case, the first and the last problems are already easy, so no operations are needed.

In the second test case, there is only one easy problem, so it is impossible to make both the first and the last problems easy.

In the third test case, one can swap the first and the second problems.

In the fourth test case, one can first swap the first and the second problems, and then — the third and the fifth problems.

---

## Sample Test Cases

### Test Case 1

**Input:**
```
4
2
0 0
2
0 1
6
1 0 0 1 0 0
5
1 0 0 1 1
```

**Output:**
```
0
-1
1
2
```

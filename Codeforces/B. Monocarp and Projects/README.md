# B. Monocarp and Projects

**Problem:** [B. Monocarp and Projects](https://codeforces.com/contest/2260/problem/B)

| Detail | Value |
|--------|-------|
| **Rating** | 0 |
| **Time Limit** | 2s |
| **Memory Limit** | 512 MB |
| **Language** | java 21,java 17,java 11,java |

**Tags:** `math`

---

## Problem Statement

B. Monocarp and Projects
time limit per test
2 seconds
memory limit per test
512 megabytes
input
standard input
output
standard output

Monocarp runs a company. Consider the work of his company over the next kk months. In the first month, the company has xx employees, not counting Monocarp himself, and yy projects need to be completed. In each next month, both the number of employees and the number of projects increase by 11.

In other words, in month ii (0≤i<k0 \le i  \lt  k), the company has x+ix+i employees and needs to complete y+iy+i projects.

In each month, Monocarp distributes the projects among the employees. Each employee must receive the same number of projects, and each project can be assigned to at most one employee. Monocarp completes all unassigned projects himself. He always chooses a distribution that makes him complete as few projects as possible.

In particular, if in some month there are aa employees and bb projects, then Monocarp assigns exactly ⌊ba⌋\left\lfloor \frac{b}{a} \right\rfloor projects to each employee, and he completes bmodab \bmod a projects himself.

Find the total number of projects that Monocarp will complete himself over the next kk months.

Input
The first line contains an integer tt — the number of test cases (1≤t≤1041 \le t \le 10^4).

Each test case consists of one line containing three integers xx, yy, and kk (1≤x≤y≤1061 \le x \le y \le 10^6; 1≤k≤10121 \le k \le 10^{12}).

Additional constraint on the input:

 -  the sum of yy over all test cases does not exceed 10610^6. 

Output
For each test case, output one integer — the total number of projects that Monocarp will complete himself over kk months.

Example
InputCopy

7
1 1 1
3 10 2
3 8 6
7 20 1
10 25 100
8 36 17
1 999900 1000000000000

OutputCopy

0
4
18
6
1425
110
999898177699820694

Note
In the first test case, the only employee completes the only project, so Monocarp is left with no projects.

In the second test case, in the first month, 1010 projects are distributed among 33 employees: each gets 33 projects, and Monocarp completes 11 project. In the second month, 1111 projects are distributed among 44 employees: each gets 22 projects, and Monocarp completes 33 projects. The answer is 1+3=41 + 3 = 4.

In the third test case, the number of projects completed by Monocarp in the six months is 22, 11, 00, 55, 55, and 55, respectively. Their sum is 2+1+0+5+5+5=182 + 1 + 0 + 5 + 5 + 5 = 18.

---

## Sample Test Cases

### Test Case 1

**Input:**
```
7
1 1 1
3 10 2
3 8 6
7 20 1
10 25 100
8 36 17
1 999900 1000000000000
```

**Output:**
```
0
4
18
6
1425
110
999898177699820694
```

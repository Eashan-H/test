# C. Game with Reversing

**Problem:** [C. Game with Reversing](https://codeforces.com/contest/1834/problem/C)

| Detail | Value |
|--------|-------|
| **Rating** | 1200 |
| **Time Limit** | 1s |
| **Memory Limit** | 256 MB |
| **Language** | java 21,java 17,java 11,java |

**Tags:** `games`, `greedy`, `math`, `strings`

---

## Problem Statement

C. Game with Reversing
time limit per test
1 second
memory limit per test
256 megabytes
input
standard input
output
standard output

Alice and Bob are playing a game. They have two strings SS and TT of the same length nn consisting of lowercase latin letters. Players take turns alternately, with Alice going first.

On her turn, Alice chooses an integer ii from 11 to nn, one of the strings SS or TT, and any lowercase latin letter cc, and replaces the ii-th symbol in the chosen string with the character cc.

On his turn, Bob chooses one of the strings SS or TT, and reverses it. More formally, Bob makes the replacement S:=rev(S)S := \operatorname{rev}(S) or T:=rev(T)T := \operatorname{rev}(T), where rev(P)=PnPn−1…P1\operatorname{rev}(P) = P_n P_{n-1} \ldots P_1.

The game lasts until the strings SS and TT are equal. As soon as the strings become equal, the game ends instantly.

Define the duration of the game as the total number of moves made by both players during the game. For example, if Alice made 22 moves in total, and Bob made 11 move, then the duration of this game is 33.

Alice's goal is to minimize the duration of the game, and Bob's goal is to maximize the duration of the game.

What will be the duration of the game, if both players play optimally? It can be shown that the game will end in a finite number of turns.

Input
Each test contains multiple test cases. The first line contains the number of test cases tt (1≤t≤1041 \le t \le 10^4). The description of the test cases follows.

The first line of each test case contains a single integer nn (1≤n≤1051 \le n \le 10^5) — the length of the strings SS and TT.

The second line of each test case contains a string SS of length nn consisting of lowercase latin letters.

The third line of each test case contains a string TT of length nn consisting of lowercase latin letters.

It is guaranteed that the sum of nn over all test cases does not exceed 10510^5.

Output
For each test case, output a single number on a separate line — the duration of the described game, if both players play optimally.

Example
InputCopy

7
5
abcde
abxde
5
hello
olleo
2
ab
cd
7
aaaaaaa
abbbbba
1
q
q
6
yoyoyo
oyoyoy
8
abcdefgh
hguedfbh

OutputCopy

1
2
3
9
0
2
6

Note
In the first test case, in her turn, Alice can replace the third symbol of the string SS with x. After that, both strings will become equal to "abxde" and the game will end after one move. Since Alice's goal is to finish the game in as few moves as possible, this move will be one of her optimal first moves, and the final answer will be 11.

In the second test case, in her turn, Alice can replace the fifth symbol of the string TT with h. After this move, S=S = "hello", T=T = "olleh". Then Bob makes his turn. In his turn, he must reverse one of the strings. If Bob chooses the string SS, then after his turn both strings will be equal to "olleh", and if he chooses the string TT, then after his turn both strings will be equal to "hello". Thus, after the presented first move of Alice, the game will definitely end in 22 moves. It can be shown that there is no strategy for Alice to finish the game in less than 22 moves, with both players playing optimally. The final answer is 22.

In the third test case, in her first move, Alice can replace the second symbol of the string SS with c. After this move, S=S = "ac", T=T = "cd". Then Bob makes his turn. If Bob reverses the string SS, then after his turn S=S = "ca", T=T = "cd". Then it is easy to see that in this case Alice can definitely finish the game on the 33-rd move, by replacing the second symbol of the string TT with a, after which both strings will become equal to "ca". If Bob reverses the string TT, then after his turn S=S = "ac", T=T = "dc". In this case, Alice can also definitely finish the game on the 33rd move, by replacing the first symbol of the string SS with d, after which both strings will become equal to "dc". Thus, Alice can definitely finish the game in 33 moves regardless of Bob's moves. It can be shown that the game cannot end in less than 33 moves, with both players playing optimally.

In the fifth test case, the strings SS and TT are equal, so the game will end without starting, in 00 moves.

---

## Sample Test Cases

### Test Case 1

**Input:**
```
7
5
abcde
abxde
5
hello
olleo
2
ab
cd
7
aaaaaaa
abbbbba
1
q
q
6
yoyoyo
oyoyoy
8
abcdefgh
hguedfbh
```

**Output:**
```
1
2
3
9
0
2
6
```

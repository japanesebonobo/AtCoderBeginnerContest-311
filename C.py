N = int(input())
A = list(map(int, ("0 " + input()).split()))
now = 1
for _ in range(N): now = A[now] #閉路内から始めるためにあらかじめN回移動する
B = []

while A[now] != 0:
    A[now], now = 0, A[now]
    B.append(now)
print(len(B))
print(*B)
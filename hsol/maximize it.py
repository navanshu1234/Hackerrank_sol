n = input()
n = n.split(" ")

k = int(n[0])
m = int(n[1])

lt = []

for i in range(k):
    x = input()
    x = x.split(" ")
    lt.append(x)
   

y = list(map(max,lt))

for j in range(0, len(y)):
    y[j] = int(y[j])

sum = 0
for i in range(0,len(y)):
    sum = sum + (y[i])*(y[i])
op = sum % m
print(op)

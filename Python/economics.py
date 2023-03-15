n=int(input("Введите число рыночных данных \n"))
s=[0]*n
d=[0]*n
k=0

print("Введите значения спроса \n")
for i in range(n):
    s[i]=int(input())

print("Введите значения предложения \n")
for i in range(n):
    d[i]=int(input())


for i in range(n):
    if (s[i] == d[i]):
        k=k+1

print("Рынок был в равновесии вот столько раз:", k)

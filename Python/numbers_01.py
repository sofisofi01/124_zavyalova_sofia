import random
l1 = [random.randint(0,9999) for x in range(random.randint(50,100))]
x = int(input("Введите положительное число х \n"))

def magic(list, n):
    summa = sum(list)
    return summa % n == 0

print(magic(l1,x))
import random

l1 = [random.randint(0,9999) for x in range(random.randint(50,100))]
l2 = [random.randint(0,9999) for x in range(random.randint(50,100))]
result = []

print(l1)
print(l2)

print("Эти элементы есть в двух списках сразу:")
for n in l1:
    if n in l2:
        result.append(n)
print(result)
import random

l1 = [random.randint(0,9999) for x in range(random.randint(50,100))]
l2 = [random.randint(0,9999) for x in range(random.randint(50,100))]

print(l1)
print(l2)

print("Эти элементы отсутствуют во втором:")
for n in l1:
    if n not in l2:
        print(n)
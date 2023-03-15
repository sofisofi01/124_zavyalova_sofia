import random

a = random.random() * (99999 - 1000) + 1000 
b = random.random() * (99999 - 1000) + 1000 
c = a + b

def eqv(x, y, z):
    e=0.0001
    return abs(x + y - z) <= e

print(eqv(a, b, c))

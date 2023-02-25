import math
m1 = 5.97600*math.pow(10,24)
g = 6.6743*math.pow(10,-11)
m2 = float(input("Введите массу планеты в кг без десяти в степени: \n"))*math.pow(10,int(input("Введите степень десятки: \n")))
r= int(input("Введите расстояние до объекта в м без степени 10: \n"))*math.pow(10,int(input("Введите степень десятки: \n")))

def gravitational_force (m0, r0):
    return (g*m1*m0/math.pow(r0,2))

your_force = gravitational_force(m2,r)
print("В данном случае сила равняется", your_force)
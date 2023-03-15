start=int(input("Введите первое значение \n"))
end=int(input("Введите второе значение \n"))

def sum_range(start, end):
    if start>end:
        start, end = end, start
    summa=sum(range(start,end+1))
    return summa

print(sum_range(start,end))
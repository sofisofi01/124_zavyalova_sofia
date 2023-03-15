str=str(input("Введите строку \n"))
marks = '''!()-[]{};?@#$%:'"\,./^&amp;*_'''
def zaborchik(stroka):
    res=''
    k=0
    for i in stroka:
        if (i in marks)|(i==' '):
            k=k+1
        if k%2==0:
            res=res+i.lower()
        else:
            res=res+i.upper()
        k=k+1
    return res

print(zaborchik(str))

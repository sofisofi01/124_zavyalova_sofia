s1 = input("Введите строку \n")
s2 = input("Введите подстроку \n")
s1 = s1.lower()
s2 = s2.lower()

def  search_substr(subst, st):
    return subst in st

print(s1, s2)

k = search_substr(s2,s1)
if k:
   print("Есть контакт!")
else:
    print("Мимо!")
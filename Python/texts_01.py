text=(input("Введите текст длиннее пяти слов \n"))
list1=text.split()

list2={}
for word in list1:
    list2[word]=list2.get(word,0)+1

print(max(list2, key=list2.get))
print(max(list1, key=len))
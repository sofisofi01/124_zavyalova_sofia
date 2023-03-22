import random

number = random.randint(1, 100)
count = 0
name = (input("Привет! Давай сыграем в игру: я загадаю число от 1 до 100, а ты угадай его. Как тебя зовут, друзяка? \n"))

file = open("game.txt", "a")

while True:
    count += 1
    print("Попытка", count)
    guess = int(input("Угадайте число от 1 до 100: "))
    if guess == number:
        print("Вы угадали!")
        file.write(f"Ваше имя: {name}\nКоличество попыток: {count}\n")
        file.close()
        break
    elif guess < number:
        print("Загаданное число больше")
    else:
        print("Загаданное число меньше")
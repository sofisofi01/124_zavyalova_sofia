import telebot
import requests

bot = telebot.TeleBot('6273138376:AAFu51ulhbeApUucoQFYCDMzTkY8vySgLD4')  # токен бота

@bot.message_handler(commands=['start'])
def start_handler(message):
    bot.send_message(message.chat.id, 'Здравствуйте! Я помогу вам узнать текущую погоду в любом городе мира. Введите название города.') 

@bot.message_handler(content_types=['text'])
def weather_handler(message):
    city = message.text
    url = f'http://api.openweathermap.org/data/2.5/weather?q={city}&appid=API_KEY'
    response = requests.get(url).json()
    if response['cod'] == 200:
        temp = round(response['main']['temp'] - 273.15, 1)  # перевод температуры из Кельвинов в градусы Цельсия
        desc = response['weather'][0]['description']
        bot.send_message(message.chat.id, f'Текущая погода в {city}: {desc}, температура {temp}°C')
    else:
        bot.send_message(message.chat.id, 'Извините, город не найден')

@bot.message_handler(commands=['help'])
def help_handler(message):
    bot.send_message(message.chat.id, 'Я могу помочь вам узнать текущую погоду в любом городе мира. Просто введите название города.')

@bot.message_handler(commands=['stop'])
def stop_handler(message):
    bot.send_message(message.chat.id, 'Спасибо за использование моих услуг. До свидания!')

bot.polling()
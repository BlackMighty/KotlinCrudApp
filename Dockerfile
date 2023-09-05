
FROM jetbrains/kotlin:latest

#Создаем рабочую директорию /app
WORKDIR /app

#Копируем JAR - файл в контейнер
COPY YourApp.jar /app/YourApp.jar

# Определите команду запуска для вашего приложения
CMD ["java", "-jar", "your-app.jar"]


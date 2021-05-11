1. Для сортування слід використати вбудовані методи сортування, доступні в мові Java2. Сортування слід реалізувати в окремому методі3. Код немає містити статичних методів/атрибутів. Дозволено лиш один статичний метод - main4. Код слід залити в окремий репозиторій, попередньо створивши pull request (тобто код слід писати в окремому branch  на його основі зробити pull request)5.  Замість написання сеттерів і геттерів слід використати аннотації Lombok (@Data) - більш детально про цю бібліотеку - https://habr.com/ru/post/438870/ 6. Перетворити проект таким чином, щоб його збірку можна було виконувати з-за допомогою  maven. Також підключити наступні плагіни в pom.xml - плагін Jacoco який виконуватиме перевірку коду тестами (в секцію build):- плагін FindBugs який здійснює автоматичну перевірку якості коду і пошук потенційних помилок в коді (в секцію reporting):- плагін PMD (в секцію reporting):- плагін Checkstyle - перевіряє дотримання code convention (в секцію reporting):7. Після завершення роботи слід виконати команду mvn site і переглянути результати її виконання в папці target/site (відкривши файл index.html)
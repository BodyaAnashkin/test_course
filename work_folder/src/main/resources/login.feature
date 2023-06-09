Feature: Вхід користувача
  Як користувач
  Щоб мати можливість використовувати сервіс
  Я хочу зареєструватися

  Scenario Outline: Успішний вхід
    Given Користувач знаходиться на сторінці входу
    When Користувач вводить свої дані: "<пошта>" та "<пароль>"
    And Користувач натискає кнопку "Ввійти"
    Then Користувач повинен бачити головну сторінку
    Examples:
      | пошта            | пароль    |
      | Test1@gmail.com   | zxc123A! |


  Scenario Outline: Неуспішний вхід
    Given Користувач знаходиться на сторінці входу
    When Користувач вводить свої дані: "<пошта>" та "<пароль>"
    And Користувач натискає кнопку "Ввійти"
    Then Користувач повинен бачити повідомлення про невдалий вхід

    Examples:
      | пошта       | пароль    |
      | asd   | zxc123A! |

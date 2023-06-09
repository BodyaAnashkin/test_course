Feature: Вхід користувача
  Як користувач
  Щоб мати можливість використовувати сервіс
  Я хочу зареєструватися

  Scenario Outline: Успішний вхід
    Given Користувач знаходиться на сторінкі входу
    Examples:
      | пошта            | пароль    |
      | Test1@gmail.com   | zxc123A! |


  Scenario Outline: Неуспішний вхід
    Given Користувач знаходиться на сторінкі входу
    Examples:
      | пошта       | пароль    |
      | asd   | zxc123A! |
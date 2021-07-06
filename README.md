# Developing Web Service on Java
## Разработка веб сервиса на Java
## Решения заданий к курсу https://stepik.org/course/146/syllabus

### HW01
- Написать сервлет, который будет обрабатывать запросы на /mirror
- При получении GET запроса с параметром key=value сервлет должен вернуть в response строку содержащую value.
- Например, при GET запросе /mirror?key=hello сервер должен вернуть страницу, на которой есть слово "hello".

### HW02
- Написать сервер с двумя сервлетами:
SignUpServlet для обработки запросов на signup и
SignInServlet для обработки запросов на signin
- Сервлеты должны слушать POST запросы с параметрами: login, password
- При получении POST запроса на signup сервлет SignUpServlet должн запомнить логин и пароль в AccountService.
После этого польователь с таким логином считается зарегистрированным.
При получении POST запроса на signin, после регистрации, SignInServlet проверяет,
логин/пароль пользователя. Если пользователь уже зарегистрирован, север отвечает:
"Status code (200)\n Authorized: <login>"
если нет: "Status code (401)\n Unauthorized"

### HW03
- Часть первая (аналогично заданию 2)
- Часть вторая (работа с базой)
    - Для запоминания пользователя AccountService должен использовать базу данных.
    - Для хранения данных пользователя используйте таблицу users:
      create table if not exists users (id bigint auto_increment, login varchar(256), password varchar(256), primary key (id));
      Сервер должен создавать таблицу при старте если она не существует.
    - При получении запроса на signup сервлет должен обратиться к DBService и записать логин и пароль в таблицу.

### HW04
- Написать вебсокет, который будет обрабатывать запросы на /chat
- При получении сообщения сокет должен отправить это сообщение обратно.


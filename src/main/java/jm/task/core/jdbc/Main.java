package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Lena", "Lenova", (byte) 25);
        userService.saveUser("Petr", "Petrov", (byte) 25);
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        userService.saveUser("Smit", "Semenov", (byte) 25);


        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();


//        Создание таблицы User(ов)
//        Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
//        Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
//        Очистка таблицы User(ов)
//        Удаление таблицы

    }
}

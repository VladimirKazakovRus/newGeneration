package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("pervii","pervii",(byte) 10);
        userService.saveUser("vtoroi","vtoroi",(byte) 20);
        userService.saveUser("tretii","tretii",(byte) 30);
        userService.saveUser("chetvertii","chetvertii",(byte) 40);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}

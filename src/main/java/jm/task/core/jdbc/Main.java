package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Nick", "Lebowski", (byte) 17);
        userService.saveUser("Captain", "Jack Sparrow", (byte) 39);
        userService.saveUser("Luke", "Skywalker", (byte) 29);
        userService.saveUser("Benjamin", "Franklin", (byte) 42);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

package user;

import admin.AdminController;
import store.Store;

import java.util.Scanner;

//싱글톤 패턴 사용
public class UserController {
    private static UserController instance = new UserController();
    private static Scanner sc = new Scanner(System.in);

    private User selectedUser;
}

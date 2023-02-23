package database;

import store.Store;
import user.User;

public class Database {
    private static Store[] store = new Store[]{new Store(), new Store(), new Store()};
    private static User[] users = new User[]{new User(), new User(), new User()};

    private Database() {
    }

    public static Store getStore(int num) {
            return store[num-1];
    }
    public static User getUser(int num) {
        return users[num-1];
    }
}

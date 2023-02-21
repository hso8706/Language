package database;

import store.Store;

public class AdminDatabase {
    private static Store[] store = new Store[]{new Store(), new Store(), new Store()};

    private AdminDatabase() {
    }

    public static Store getStore(int num) {
        return store[num-1];
    }
}

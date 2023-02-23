package store;

import menu.Menu;

public class Store {
    private String name;
    private Menu[] menu = new Menu[3];

    public Store() {
        this.name = "Blank";
        for (int i = 0; i < 3; i++) {
            menu[i] = new Menu();
        }
    }

    public String getName() {
        return name;
    }

    public Menu getMenu(int num) {
        return menu[num-1];
    }

    public void setName(String name) {
        this.name = name;
    }
}

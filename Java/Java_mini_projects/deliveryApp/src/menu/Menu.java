package menu;

public class Menu {
    private String name;
    private int price;
    private int stock;

    public Menu() {
        this.name = "blank";
        this.price = 0;
        this.stock = 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

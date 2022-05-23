import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Supermarket> supermarkets = new ArrayList<Supermarket>();

        toys product1 = new toys("Otdel_1", "Panda", "Russia", 200, "toys_russia",6, "soft toy");
        supermarkets.add(product1);

        fruits product2 = new fruits("Otdel_2", "Apple", "Kazakhstan", 50, "fruits_kazakhstan", 12, 20);
        supermarkets.add(product2);

        dimensionalGoods product3 = new dimensionalGoods("Otdel_3", "Closet", "USA", 15000, "furniture_USA", 180, 120, 50);
        supermarkets.add(product3);

        Supermarket product4 = new Supermarket("Otdel_4", "Mug", "China", 130, "dishes_china");
        supermarkets.add(product4);

        for (int i = 0; i < supermarkets.size(); i++){
            System.out.println(supermarkets.get(i).toString());
        }
    }
}

package patterns.creational.builder;

public class App {
    public static void main(String[] args) {

        FoodOrder foodOrder=new FoodOrder.Builder()
                .bread("white bread")
                .meat("bacon")
                .fish("jh")
                .condiments("olive oil")
                .build();


        System.out.println(foodOrder.toString());

    }
}

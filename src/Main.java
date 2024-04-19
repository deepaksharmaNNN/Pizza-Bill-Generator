public class Main {
    public static void main(String[] args) {
        DeluxePizza deluxePizza = new DeluxePizza(false);
        deluxePizza.addPaperBag();
        System.out.println("Price of Deluxe Pizza(Non-Vegetarian) " +"\n" + deluxePizza.getBill() + "\n");

        DeluxePizza deluxePizza2 = new DeluxePizza(true);
        System.out.println("Price of Deluxe Pizza(Vegetarian) " +"\n" + deluxePizza2.getBill() + "\n");

        Pizza pizza = new Pizza(false);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
        pizza.addPaperBag();
        System.out.println("Price of Pizza(Non-Vegetarian) " +"\n" + pizza.getBill() + "\n");

        Pizza pizza2 = new Pizza(true);
        pizza2.addPaperBag();
        System.out.println("Price of Pizza(Vegetarian) " +"\n" + pizza2.getBill() + "\n");
    }
}

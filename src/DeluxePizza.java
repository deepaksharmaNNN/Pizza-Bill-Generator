public class DeluxePizza extends Pizza{
    public DeluxePizza(boolean isVegetarian){
        super(isVegetarian);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}

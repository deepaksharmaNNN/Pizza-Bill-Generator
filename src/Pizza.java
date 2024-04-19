public class Pizza {
    private int price;
    private boolean isVegetarian;
    private String bill;
    private int basePrice;
    private int extraToppingsPrice;
    private int extraCheesePrice;
    private int paperBagPrice;

    private boolean isExtraCheeseAdded;
    private boolean isPaperBagAdded;
    private boolean isExtraToppingsAdded;
    private boolean isBillGenerated;

    public Pizza(boolean isVegetarian){
        this.isVegetarian = isVegetarian;
        if(this.isVegetarian){
            this.basePrice = 300;
            this.extraToppingsPrice  = 70;
        } else {
            this.basePrice = 400;
            this.extraToppingsPrice  = 120;
        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.price = this.basePrice;
    }
    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        if(!this.isExtraCheeseAdded){
            this.price += this.extraCheesePrice;
            this.isExtraCheeseAdded = true;
        }
    }
    public void addPaperBag(){
        if(!this.isPaperBagAdded){
            this.price += this.paperBagPrice;
            this.isPaperBagAdded = true;
        }
    }
    public void addExtraToppings(){
        if(!this.isExtraToppingsAdded){
            this.price += this.extraToppingsPrice;
            this.isExtraToppingsAdded = true;
        }
    }
    public String getBill(){
        if(!this.isBillGenerated){
            this.bill = "Base Price: " + this.basePrice + "\n";
            if(this.isExtraCheeseAdded){
                this.bill += "Extra Cheese: " + this.extraCheesePrice + "\n";
            }
            if(this.isExtraToppingsAdded){
                this.bill += "Extra Toppings: " + this.extraToppingsPrice + "\n";
            }
            if(this.isPaperBagAdded){
                this.bill += "Paper Bag: " + this.paperBagPrice + "\n";
            }
            this.bill += "Total: " + this.price + "\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}

# Pizza-Bill-Generator

## Description

In a pizza cafe, there are two types of pizzas: regular and deluxe, both available in veg and non-veg variants with base prices. Customers can opt for extra cheese or toppings on regular pizzas. Deluxe pizzas come with extra cheese and toppings by default. Additionally, customers opting for takeaway need to pay for the paper bag.

### Pricing Details

- Veg pizza base price: 300
- Non-veg pizza base price: 400
- Extra cheese price: 80
- Extra toppings for veg pizza: 70
- Extra toppings for non-veg pizza: 120
- Paper bag price: 20

## Main Class: Main.java

### Overview

The `Main.java` class is responsible for creating instances of `Pizza` and `DeluxePizza` and printing out their details.

### Example Scenarios
1. Deluxe Pizza (Non-Vegetarian)
```java
DeluxePizza deluxePizza = new DeluxePizza(false);
deluxePizza.addPaperBag();
System.out.println("Price of Deluxe Pizza(Non-Vegetarian):\n" + deluxePizza.getBill() + "\n");
```
Price of Deluxe Pizza (Non-Vegetarian):
- Base Price: 400
- Extra Cheese: 80
- Extra Toppings: 120
- Paper Bag: 20
- Total: 620

2. Deluxe Pizza (Vegetarian)
```java
DeluxePizza deluxePizza2 = new DeluxePizza(true);
System.out.println("Price of Deluxe Pizza(Vegetarian):\n" + deluxePizza2.getBill() + "\n");
```
- Price of Deluxe Pizza(Vegetarian):
- Base Price: 300
- Extra Cheese: 80
- Extra Toppings: 70
- Total: 450

3. Pizza (Non-Vegetarian)
```java
Pizza pizza = new Pizza(false);
pizza.addExtraCheese();
pizza.addExtraToppings();
pizza.addPaperBag();
System.out.println("Price of Pizza(Non-Vegetarian):\n" + pizza.getBill() + "\n");
```
- Price of Pizza(Non-Vegetarian):
- Base Price: 400
- Extra Cheese: 80
- Extra Toppings: 120
- Paper Bag: 20
- Total: 620

4. Pizza (Vegetarian)
```java
Pizza pizza2 = new Pizza(true);
pizza2.addPaperBag();
System.out.println("Price of Pizza(Vegetarian):\n" + pizza2.getBill() + "\n");
```

- Price of Pizza(Vegetarian):
- Base Price: 300
- Paper Bag: 20
- Total: 320

Class Structure
The Pizza class serves as the base class, containing properties such as price, vegetarian status, bill, base price, extra toppings price, extra cheese price, paper bag price, and methods such as getPrice(), addExtraCheese(), addPaperBag(), addExtraToppings(), and getBill().

The DeluxePizza class extends the Pizza class and automatically adds extra cheese and toppings to the pizza in its constructor.

Expected Output
The output of the Main.java class will display the bill details for each pizza, including the base price, extra cheese price (if added), extra toppings price (if added), paper bag price (if added), and the total price.

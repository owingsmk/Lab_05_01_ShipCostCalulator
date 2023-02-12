public class Main {
    public static void main(String[] args) {
        //First varible
        final double freeShipping = 100;
        double shippingCost;
        double totalPrice;
                System.out.println("What is the price of your item?"); //Output asking what the price of the item was
        //Step 2 gets input
        int itemPrice = 100;  //User input of price

        //Step 3 logical opterations
            if (itemPrice>=freeShipping) {
                System.out.println("Your shipping is free! ");
                shippingCost=0;
            }
            else {
                System.out.println("Your will pay a 2% shipping fee. ");
                shippingCost = itemPrice * 0.02;
                System.out.println("Your shipping cost will be: "+ shippingCost);
            }
        totalPrice=itemPrice+shippingCost;
        System.out.println("Your total plus shipping is " + totalPrice);
     }
}
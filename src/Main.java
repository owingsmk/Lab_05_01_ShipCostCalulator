public class Main {
    public static void main(String[] args) {

        final int freeShipping = 100
        System.out.println("What is the price of your item?"); //Output asking what the price of the item was
        int itemPrice = 89;  //User input of price
        double shippingCost;
        double totalPrice;

        if(itemPrice>=freeShipping);
        {
            System.out.println("Your shipping is free! ");
        }
        if (itemPrice<freeShipping);
        {
            System.out.println("You will be charged 2% shipping fee plus your item price. ");
        }
            shippingCost = itemPrice * 0.02;
        System.out.println("Your shipping cost will be: "+ shippingCost);
        totalPrice=itemPrice+shippingCost;
                System.out.println("Your total plus shipping is " + totalPrice);

    }
}
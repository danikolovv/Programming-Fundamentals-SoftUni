package Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. получени монети от машината
        double coinsReceivedSum = 0;
        String coinsReceived = scanner.nextLine();
        double price = 0;

        //2. докато не получим Start се приемат монети
        while (!coinsReceived.equals("Start")){
            double converted = Double.parseDouble(coinsReceived);
            //4. машината работи само с 0.1, 0.2, 0.5, 1 и 2 монети
            if (converted != 0.1 && converted != 0.2 && converted != 0.5 && converted != 1 && converted != 2){
                //5. обаче ако са различни се изписва "Cannot accept {money}" --> %.2f
                System.out.printf("Cannot accept %.2f\n", converted);
                converted = 0;
            }
            //3. трябва да се сумират след като се пуснат в машината
            coinsReceivedSum += converted;
            coinsReceived = scanner.nextLine();
        }

        //6. запазват се отделно от финалната сума

        String product = scanner.nextLine();
        //7. докато не се получи End могат да се купуват --> "Nuts" = 2.0, "Water" = 0.7, "Crisps" = 1.5, "Soda" = 0.8, "Coke" = 1.0
        while (!product.equals("End")){
            //8. ако продукта, който се опитва да купи човека не е сред горепосочените да се изписва --> "Invalid product"
            if (!product.equals("Nuts") && !product.equals("Water") && !product.equals("Crisps") && !product.equals("Soda") && !product.equals("Coke")){
                System.out.println("Invalid product");
            }
            switch (product){
                case "Nuts":
                    price = 2.0;
                    if (coinsReceivedSum - price < 0){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s\n", product);
                        coinsReceivedSum -= price;
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (coinsReceivedSum - price < 0){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s\n", product);
                        coinsReceivedSum -= price;
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (coinsReceivedSum - price < 0){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s\n", product);
                        coinsReceivedSum -= price;
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (coinsReceivedSum - price < 0){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s\n", product);
                        coinsReceivedSum -= price;
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (coinsReceivedSum - price < 0){
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s\n", product);
                        coinsReceivedSum -= price;
                    }
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", coinsReceivedSum);

        //9. ако човека няма пари, за да купи продукт да се изписва --> "Sorry, not enough money"
        //10. ако човек купи успешно продукт/и да се изписва --> "Purchased {product name}"
        //11. след като се получи команда End да се изписва "Change: {money left}" --> %.2f


    }
}

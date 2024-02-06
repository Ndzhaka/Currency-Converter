import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter a valid name");
            String name = scanner.nextLine();
            if (!name.matches(".*\\d.*")) {
                System.out.println("Welcome" + " "+name);
                break;
            }
        } while (true);

        System.out.println("Please enter the amount you'd like to enter");
        int ori_Amount = scanner.nextInt();
        System.out.println("""
                What's your currency?
                1.)GBP
                2.)NZD
                3.)Aud
                4.)Zar
                5.)Euro""");
        int currency = scanner.nextInt();


        switch (currency){

            case 1 :
                System.out.println("You have"+" "+ori_Amount+"GBP");
                System.out.println("""
                Which currency would you like to convert to?
                1.)NZD
                2.)Aud
                3.)Zar
                4.)Euro
                """);

                int currency_choice =  scanner.nextInt();

              while(currency_choice>4){
                  System.out.println("Please enter a number from 1-5!");
                  currency_choice = scanner.nextInt();
              }
                if (currency_choice == 1) {
                    double finalAmount = ori_Amount*2.07;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"New Zealand Dollar");
                } if (currency_choice == 2) {
                double finalAmount = ori_Amount*1.93 ;
                System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Australian Dollar");
            }
                if (currency_choice == 3) {
                    double finalAmount = ori_Amount*23.81;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"South African Rand");
                }
                if (currency_choice == 4) {
                    double finalAmount = ori_Amount*1.17;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Euro");
                }
                break;

            case 2:
                System.out.println("You have"+" "+ori_Amount+"NZD");
                System.out.println("""
                Which currency would you like to convert to?
                1.)Gbp
                2.)Aud
                3.)Zar
                4.)Euro""");
                 currency_choice =  scanner.nextInt();
                while(currency_choice>4){
                    System.out.println("Please enter a number from 1-4!");
                    currency_choice = scanner.nextInt();
                }
                if (currency_choice == 1) {
                    double finalAmount = ori_Amount*0.48;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Great British Pounds");
                }if (currency_choice == 2) {
                double finalAmount = ori_Amount*0.93;
                System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Australian Dollar");
            }
                if (currency_choice == 3) {
                    double finalAmount = ori_Amount*11.47;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"South African Rand");
                }
                if (currency_choice == 4) {
                    double finalAmount = ori_Amount*0.56 ;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"European Euro");
                }
                break;
            case 3:
                System.out.println("You have"+" "+ori_Amount+"AUD");
                System.out.println("""
                Which currency would you like to convert to?
                1.)NZD
                2.)Gbp
                3.)Zar
                4.)Euro""");
                currency_choice =  scanner.nextInt();
                while(currency_choice>4){
                    System.out.println("Please enter a number from 1-4!");
                    currency_choice = scanner.nextInt();
                }
                if (currency_choice == 1) {
                    double finalAmount = ori_Amount*1.07;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"New Zealand Dollar");
                } if (currency_choice == 2) {
                double finalAmount = ori_Amount*0.52;
                System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Great British Pounds");
            }
                if (currency_choice == 3) {
                    double finalAmount = ori_Amount*12.30;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"South African Rand");
                }
                if (currency_choice == 4) {
                    double finalAmount = ori_Amount*0.61;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"European Euro");
                }
                break;
            case 4:
                System.out.println("You have"+" "+ori_Amount+"ZAR");
                System.out.println("""
                Which currency would you like to convert to?
                1.)NZD
                2.)Aud
                3.)Gbp
                4.)Euro""");
                currency_choice =  scanner.nextInt();
                while(currency_choice>4){
                    System.out.println("Please enter a number from 1-4!");
                    currency_choice = scanner.nextInt();
                }
                if (currency_choice == 1) {
                    double finalAmount = ori_Amount*0.087;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"New Zealand Dollar");
                } if (currency_choice == 2) {
                double finalAmount = ori_Amount*0.081;
                System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Australian Dollar");
            }
                if (currency_choice == 3) {
                    double finalAmount = ori_Amount*0.042 ;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Great British pound");
                }
                if (currency_choice == 4) {
                    double finalAmount = ori_Amount*0.049;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"European Euro");
                }
            case 5:
                System.out.println("You have"+" "+ori_Amount+"EUR");
                System.out.println("""
                Which currency would you like to convert to?
                1.)NZD
                2.)Aud
                3.)Zar
                4.)GBP""");
                currency_choice =  scanner.nextInt();
                while(currency_choice>4){
                    System.out.println("Please enter a number from 1-4!");
                    currency_choice = scanner.nextInt();
                }
                if (currency_choice == 1) {
                    double finalAmount = ori_Amount*1.77;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"New Zealand Dollar");
                } if (currency_choice == 2) {
                double finalAmount = ori_Amount*1.65;
                System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Australian Dollar");
            }
                if (currency_choice == 3) {
                    double finalAmount = ori_Amount*20.30;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"South African Rand");
                }
                if (currency_choice == 4) {
                    double finalAmount = ori_Amount*0.85;
                    System.out.println("you have" + " " +Math.floor(finalAmount)+" "+"Great British pound");
                }
        }

        






    }

}

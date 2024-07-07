package Task_Window;
import java.text.DecimalFormat;
import java.util.*;
public class CURRENCY_CONVERTER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter!");
        DecimalFormat f = new DecimalFormat("##.##");
        double amount;
        double rupee, dollar, pound, euro;
        int choice;
        System.out.println("Following are the choices to Change Currency: ");
        System.out.println("Enter 1: Rupee");
        System.out.println("Enter 2: Dollar");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Euro");
        System.out.println("Choose from the above choices: ");
        choice = sc.nextInt();
        System.out.println("Enter amount you want to Convert: ");
        amount = sc.nextDouble();
        switch (choice) {
            case 1: //Rupee Conversion
                dollar = amount / 83;
                System.out.println(amount + " "  + "Rupee" + " " + f.format(dollar) + " " + "Dollar");

                pound = amount / 107;
                System.out.println(amount + " "  + "Rupee" + " " +f.format(pound) + " " + "Pound");

                euro = amount / 91;
                System.out.println(amount + " " + "Rupee" + " " +f.format(euro) + " "  + "Euro");
                break;

            case 2: //Dollar Conversion
                rupee = amount * 83;
                System.out.println(amount + " " + "Dollar" + " " +f.format(rupee) + " "  + "Rupee");

                pound = amount * 0.78;
                System.out.println(amount + " " + "Dollar" + " " +f.format(pound) + " " + "Pound");

                euro = amount * 0.92;
                System.out.println(amount + " " + "Dollar" + " " +f.format(euro) + " " + "Euro");
                break;

            case 3: //Pound Conversion
                rupee = amount * 107;
                System.out.println(amount + " " + "Pound" + " " +f.format(rupee) + " "  + "Rupee");

                dollar = amount * 1.28;
                System.out.println(amount + " " + "Pound" + " " +f.format(dollar) + " " + "Dollar");

                euro = amount * 1.18;
                System.out.println(amount + " " + "Pound" + " " +f.format(euro) + " " + "Euro");
                break;

            case 4: // Euro Conversion
                rupee = amount * 91;
                System.out.println(amount + " " + "Euro" + " " +f.format(rupee) + " " + "Rupee");

                dollar = amount * 1.09;
                System.out.println(amount + " " + "Euro" + " " +f.format(dollar) + " " + "Dollar");

                pound = amount * 0.85;
                System.out.println(amount + " " + "Pound" + " " +f.format(pound) + " " + "Pound");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}

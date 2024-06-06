import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Fruit:");
        String Fruit = in.next();
        System.out.println("Enter the Amount:");
        int Amount = in.nextInt();

        // SWITCH STATEMENT
        switch (Fruit){
            case "Mango":
                System.out.println("King of Fruits!");
                // break terminates the sequence, otherwise it will execute even if it's false.
                break;
            case "Apple":
                System.out.println("Keeps the doctor away :)");
                break;
            case "Kiwi":
                System.out.println("Good for skin");
                break;
                // no break statement with the default case or last case.
            default:
                System.out.println("Must be good!");
        }

        // ENHANCED SWITCH STATEMENT
        switch (Fruit) {
            case "Mango" -> System.out.println("King of Fruits!");
            case "Apple" -> System.out.println("Keeps the doctor away :)");
            case "Kiwi" -> System.out.println("Good for skin");
            default -> System.out.println("Must be good!");
        }

        // NESTED SWITCH STATEMENT
         switch (Fruit){
            case "Mango":
                System.out.println("King of Fruits!");
                break;
            case "Apple":
                System.out.println("Keeps the doctor away :)");
                switch (Amount) {
                    case 1:
                        System.out.println("1kg for 50 rupees");
                        break;
                    case 2:
                        System.out.println("2kg for 80 rs");
                        break;
                    default:
                        System.out.println("Don't have this much");
                }
                break;
            case "Kiwi":
                System.out.println("Good for skin");
                break;
            default:
                System.out.println("Must be good!");
        }
    }
}

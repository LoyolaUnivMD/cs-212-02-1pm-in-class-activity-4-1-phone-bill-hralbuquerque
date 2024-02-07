import java.util.Scanner;
import java.text.DecimalFormat;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat dfmt = new DecimalFormat("###,###.##");

        System.out.println("What data plan do you have, Green, Blue, or Purple? ");
        String data_plan = input.nextLine();

        // Green data plan
        if (data_plan.equals("Green")) {
            var price = 49.99;

            System.out.println("How many gigabytes did you used this month? ");
            Double gb_used = input.nextDouble();

            input.nextLine();

            if (gb_used <= 2) {
                Double total = price;
                String ctotal = dfmt.format(total);
                System.out.println("You owe $" + ctotal + " this month.");
            }
            else if (gb_used > 2) {
                Double total = price + (gb_used - 2) * 15;
                if (total > 75) {
                    System.out.println("Do you have a coupon? ");
                    String coupon = input.nextLine();
                    if (coupon.equals("Yes")) {
                        total = total - 20;
                        String ctotal = dfmt.format(total);
                        System.out.println("You owe $" + ctotal + " this month.");
                    }
                    else {
                        String ctotal = dfmt.format(total);
                        System.out.println("You owe $" + ctotal + " this month.");
                    }
                }
            }
        }
        // Blue data plan
        else if (data_plan.equals("Blue")) {
            var price = 70.00;

            System.out.println("How many gigabytes did you use this month? ");
            Double gb_used = input.nextDouble();

            if (gb_used <= 4) {
                Double total = price;
                String ctotal = dfmt.format(total);
                System.out.println("You owe $" + ctotal + " this month.");
            }
            else if (gb_used > 4) {
                Double total = price + (gb_used - 4) * 10;
                String ctotal = dfmt.format(total);
                System.out.println("You owe $" + ctotal + " this month.");
            }
        }
        // Purple data plan
        else if (data_plan.equals("Purple")) {
            var price = 99.95;
            var total = price;
            String ctotal = dfmt.format(total);
            System.out.println("You owe $" + ctotal + " this month.");
        }
    }
}
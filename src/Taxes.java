import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print("(0 - Single filer, 1 - Married filing jointly or qualifying widow(er), " +
                "2 - Married filing separately, 3 - Head of household) Enter the filing status: ");
        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute the tax based on the tax rates
        double tax = 0.0;
        if (status == 0) {
            // Single filer
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            }
        } else if (status == 1) {
            // Married filing jointly or qualifying widow(er)
            // Similar logic for other filing statuses...
            // You can complete the remaining cases based on the tax rates provided.
        }

        // Display the calculated tax
        System.out.println("Tax is $" + tax);
    }
}


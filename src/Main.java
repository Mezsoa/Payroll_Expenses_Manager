import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //(while) loop with a try-catch to be able to return to option menu/also to catch up invalid input (letters)..
        while (true) {

            try {

                System.out.println("\n");

                // Prints out the menu options.
                System.out.println("Hey there!\nYou have four options to choose from:\n" +
                        "Type 1 press Enter for Option (1)\n" +
                        "Type 2 press Enter for Option (2)\n" +
                        "Type 3 press Enter for Option (3)\n" +
                        "Type 0 press Enter to exit the program");

                System.out.println("-------------------------------------");

                // Prints out the menu options
                System.out.println("Option 1: Pay salaries to employees.\n" +
                        "Option 2: Create a new invoice.\n" +
                        "Option 3: Pay one or more invoices.");

                // Gives option  a scanner input/ so the user can create input.
                int option = input.nextInt();



                // If input is equal to 1 then the first if statement are true and continues.
                if (option == 1)
                {
                    System.out.println("Please type in the amount of employees that you wanna pay (integers only) press Enter.");

                    // Creates a new  int input / for amount of employees typed in.
                    int employee = input.nextInt();

                    // Creates an array that stores Double values, Storage are equivalent to (int employee).
                    double[] storage = new double[employee];

                    // Create a for-loop to do next employee. If i i's less then the previous input of employees to pay it will repeat until it reaches the right amount.
                    for (int i = 0; i < employee; i++) {

                        System.out.println("Now type in the paycheck amount below for employee (" + (i + 1) + ") press Enter: ");

                        // Storing the result of employee paycheck input for each employee minus the tax of 30%
                        storage[i] = input.nextInt() * 0.70;
                    }

                    System.out.println("Displayed below are each employees salary after 30% tax\n");

                    // i is equal to 0 and as long as i is less than the amount of values inside the variable (storage) it will repeat itself.
                    for (int i = 0; i < storage.length; i++) {

                        // displays the salary for each employee after tax of 30%
                        System.out.println("salary for employee (" + (i + 1) + ") after tax: \n" + storage[i] + "kr");

                    }

                    System.out.println("--------Return to option menu--------");


                }
                // If input is equal 2 then it jumps to second statement and runs this block of code
                else if (option == 2)

                {

                    System.out.println("Please type the total amount of the new invoice (Integers only) press Enter");
                    System.out.println("-------------------------------------");

                    // Variables & values for the bank account array where i will store the info.
                    double vat = 1.25;                  // the vat amount (25%).
                    double input1 = input.nextDouble(); // new double input so that we don't make 2 inputs.
                    double noVat = input1 / vat;        // Divides input1  with 1.25
                    double vatCost = input1 - noVat;    //taking input minus result(input1 divided with 1.25) to get the VAT price.
                    double accountBalance = 100000;     //balance in Kr
                    double typeInput = accountBalance - input1; //tracks my account balance after i add the invoice

                    //array list to be able to add the values in to the array.
                    ArrayList<Double> myAccountBalance = new ArrayList<>();
                    myAccountBalance.add(accountBalance);
                    myAccountBalance.add(input1);
                    myAccountBalance.add(typeInput);

                    //created a lot of separate println due to that i want different text in all of them.
                    System.out.println("-------------------------------------");
                    System.out.println("Initial bank account balance: " + accountBalance + "Kr");
                    System.out.println("Invoice balance: " + input1 + "Kr");
                    System.out.println("Account balance after invoice: " + typeInput + "Kr");

                    System.out.println("-------------------------------------");

                    System.out.println("The total invoice amount: " + input1 + "Kr\n");
                    System.out.println("The VAT amount for your invoice: " + vatCost + "Kr\n");
                    System.out.println("The invoice amount excluding VAT: " + noVat + "Kr\n");
                    System.out.println("--------Return to option menu--------");



                }
                // If input of option is equal to 3  the program asks user to type amount of invoices.
                else if (option == 3)

                {

                    System.out.println("Please type in the amount of invoices that you would like to pay");
                    System.out.println("-------------------------------------");

                    // Variables & values for a new array to store info in.
                    double invoices = input.nextInt();      // Amount of invoices to pay
                    double accountBalance = 150000;         // Amount of money the user have inside there account.
                    double totalInvoiceValue = 0.0;         // The initial storage value inside the array
                    double[] invoiceStorage = new double[(int) invoices]; // Stores invoice amount inside invoiceStorage array.

                    // (i) is equal to 0, which means that as long as (i) is less than the amount of invoices typed in before, the loop is going to continue until its reached its amount of equal input.
                    for (int i = 0; i < invoices; i++) {

                        System.out.println("Please type in the invoice amount for invoice(" + (i + 1) + ") press Enter");
                        System.out.println("---------------------------------");

                        invoiceStorage[i] = input.nextInt(); //Stores the value of input that are controlled by [i] inside the array  of invoiceStorage.

                    }

                    System.out.println("\n");
                    System.out.println("Displayed below are total invoice amount and your total account balance after the invoices are paid");
                    System.out.println("-------------------------------------");

                    //(i) is equal to 0 and less than the length of values inside the array, it will repeat until right amount of values are reached.
                    for (int i = 0; i < invoiceStorage.length; i++) {

                        // calculates the total sum of all numbers inside the array totalInvoiceValue.
                        totalInvoiceValue += invoiceStorage[i];
                    }

                    // Subtracts sum value of array with the accountBalance.
                    accountBalance -= totalInvoiceValue;

                    System.out.println("Here are the total amount on your invoices: (" + totalInvoiceValue + ")Kr");
                    System.out.println("------------------------------------");
                    System.out.println("Here is your account balance after paid invoices: (" + accountBalance + ")Kr");
                    System.out.println("--------Return to option menu--------");

                    // If input is equal 0 we will willingly break the loop and the exit, program restart needs to occur.
                } else if (option == 0) {
                    System.out.println("You have exited the program");
                    System.out.println("------------------------------------");
                    System.out.println("If you want to restart the program press: (Ctrl + Shift + F10)");
                    break;

                    // number input not 1-3 or 0 then the loops repeat to give user another try to input correct option integer.
                } else {
                    System.out.println("------------------------------------");
                    System.out.println("Invalid number input!\nPlease try again!");
                    System.out.println("------------------------------------");
                    System.out.println("\n");
                }

                //this is the catch if an input is incorrect in this scenario it's for letters input. this will also break the loop and exit the program, program restart needs to occur.
            } catch (InputMismatchException e) {
                System.out.println("wrong input try again!");
                System.out.println("------------------------------------");
                input.nextLine();
            }
        }

    }
}

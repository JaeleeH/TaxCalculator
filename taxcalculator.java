// Jaelee Jeong - module 1
// Tax calculator in Java
// requirements: use  some variables, expressions, conditionals, loops, functions, 
//                  classes, data struct

// import for user input
import java.util.Scanner;

// main class
public class taxcalculator{
    // method for calculations
    static double taxRateCalc(float income, String maritalStatus, float deductions){
        // take in account taxable income
        if (deductions > 0){
            income = income - deductions;
        }

        // declare variable
        double taxRate = 0;
        // take into account different case for string
        maritalStatus = maritalStatus.toUpperCase();
        
        // take in account of marital status
        if (maritalStatus.equals("S")){
            // calculation for single
            if (income <= 11000){
                taxRate = 0.1;
            }
            else if (income <= 44725){
                taxRate = 0.12;
            }
            else if (income <= 995375){
                taxRate =  0.22;
            }
            else if (income <= 182100){
                taxRate = 0.24;
            }
            else if (income <= 231250){
                taxRate = 0.32;
            }
            else if (income <= 578125){
                taxRate = 0.35;
            }
            else{
                taxRate = 0.37;
            }   
        }
        else{
            // calculation for married
            if (income <= 22000){
                taxRate = 0.1;
            }
            else if (income <= 89450){
                taxRate = 0.12;
            }
            else if (income <= 190750){
                taxRate =  0.22;
            }
            else if (income <= 364200){
                taxRate = 0.24;
            }
            else if (income <= 462500){
                taxRate = 0.32;
            }
            else if (income <= 693750){
                taxRate = 0.35;
            }
            else{
                taxRate = 0.37;
            }   
        }

        // calculate federal tax
        double federalTax = taxRate * income;

        return federalTax;

    }

    // main method
    public static void main(String[] args){
        //user inputs
        Scanner inputValue = new Scanner(System.in);

        // get income amount
        System.out.println("Enter your gross income: ");
        float income  = inputValue.nextFloat();
        inputValue.nextLine();

        // get marital status
        System.out.println("Are you filing single or married (S or M): ");
        String maritalStatus = inputValue.nextLine();

        // get amount of deductions (if any)
        System.out.println("List the amount of deductions you have if any: ");
        float deductions = inputValue.nextFloat();

        // close Scanner 
        inputValue.close();
        
        // call the method to return the federal tax rate
        double federalTax = taxRateCalc(income, maritalStatus, deductions);

        //print output
        System.out.printf("This year, you will pay a total of $%.2f for federal tax.", federalTax);

    }

}



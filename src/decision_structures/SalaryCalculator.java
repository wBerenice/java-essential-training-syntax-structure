package decision_structures;

import java.util.Scanner;

/*
If Statement.
All salespeople get a payment of $1,000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //Initialize known values

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did the employee make this week?");
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
//        if(sales > quota){
//            salary += 250;
//        }
//        if(sales > quota) salary += 250;

        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        }else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }

        //Output
        System.out.println("The employee's pay is $" + salary);

    }//main
}//SalaryCalculator

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
import java.text.*;
/**
 *
 * @author JhayJ
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#.##");
        
        System.out.print("Enter Daily salary : ");
        double dailySalary = scan.nextDouble();
        
        System.out.print("Enter Days of work : ");
        double daysOfWork = scan.nextDouble();
        
        System.out.print("Enter OveTime hours : ");
        double overTimeHours = scan.nextDouble();
        
        double salary = dailySalary * daysOfWork;
        double overTime = salary * 0.1; // 10%
        double sss = salary * 0.02; // 2&
        double phil = 250;
        double tax = salary * 0.05; // 5%
        double pagIbig = 250;
        double grossSalary = salary + overTime;
        double totalDeduction = pagIbig + sss + phil + tax;
        double totalNetSalary = grossSalary - totalDeduction; 
        
        System.out.println("\n Gross Salary : " + f.format(grossSalary));
        System.out.println("Total Deduction : " + f.format(totalDeduction));
        System.out.println("Overtime : " + f.format(overTime));
        System.out.println("Total Net Salary : " + f.format(totalNetSalary));
        
        
    }
    
}

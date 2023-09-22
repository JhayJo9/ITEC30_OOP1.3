/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averangeact;
import java.util.*;
import java.text.*;
/**
 *
 * @author JhayJ
 */
public class AverageAct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat f = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);
        double prem, mid , fl;
        System.out.print("Enter Prelim : ");
        prem = scan.nextDouble();
        
        System.out.print("Enter Midterm : ");
        mid = scan.nextDouble();
        
        System.out.print("Enter Finalterm : ");
        fl = scan.nextDouble();
        
        double ave = (prem + mid + fl) / 3;  
        System.out.println("Average : " + f.format(ave));        
    }
} 

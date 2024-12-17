/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mod5ct;

/**
 *
 * @author kaleyschlimgen
 */
import java.util.Scanner;

public class Mod5CT {
    private static int i = 1;

    public static int calculateSum(int n, Scanner scanner) {
        //private static int counter = 1;
       
            
        if (n <= 0) {
            return 0;
        } 
        else {
            //int i;
            //i = 1;
            
            //for (i = 1; i <= 5; i++){
            System.out.print("Enter number " + i + ": ");
            i++;
                int myNum = scanner.nextInt();
            
               //if i don't have below, i increments??
               //return myNum;
            
               return myNum + calculateSum(n - 1, scanner);
           
            //}
            //return 0;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int result = calculateSum(5, scanner);
        System.out.println("Sum: " + result);
    }
}

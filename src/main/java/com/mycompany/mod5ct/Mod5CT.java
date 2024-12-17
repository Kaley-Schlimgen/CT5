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

    public static int sum(int myNum) {
        int i;
       
        if (myNum == 0) {
            return 0;
        } 
        else {
            
            for (i = 1; i <= 5; ++i){
            System.out.println("Enter number " + i + ": ");
            return myNum + sum(myNum - 1);
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int number = 5;
        int result = sum(number);
        System.out.println("Sum: " + result);
    }
}

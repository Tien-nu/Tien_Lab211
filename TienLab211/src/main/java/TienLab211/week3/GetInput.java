/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week3;

import java.util.Scanner;

/**
 *
 * @author nguyenthithuytien
 */
public class GetInput {
        static Scanner sc = new Scanner(System.in);
        public static String get(String msg){   
        System.out.println(msg);
        return sc.nextLine();
    }
    
//    public static double getDouble(String salary) {
//        double result = 0.0;
//        boolean isValid = false;
//
//        while (!isValid) {
//            try {
//                System.out.print(salary);
//                result = Double.parseDouble(sc.nextLine());
//                isValid = true;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a valid double.");
//        }
//    }

//        return result;    
//    }
    
    public static int getInt(String n){
        int result = 0;
        boolean isValid = false;
        while(!isValid){
            System.out.println(n);
            result = Integer.parseInt(sc.nextLine());
            isValid = true;
        }
            return result;
        
    }

}

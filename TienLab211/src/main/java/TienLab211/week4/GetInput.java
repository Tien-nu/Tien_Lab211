/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week4;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GetInput {
    static Scanner sc = new Scanner(System.in);
    
    public static String get(String msg){   
        System.out.println(msg);
        return sc.nextLine();
    }
    
    public static Date getDateInput(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            String input = get(msg);
            try {
                Date date = dateFormat.parse(input);
                if(date.getDate() >= Year.now().getValue()){
                    throw new Exception ("zzz");
                }
                return dateFormat.parse(input);
            } catch (Exception e) {
                System.out.println("Please enter right Date format: dd/MM/yyyy");
            }
        }
    }
    
    public static int getInt(String msg) {
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(msg);
            String input = sc.nextLine().trim();
            if(input.length() > 6){
                System.out.println("Enter 6 digit.");
                continue;
            }
            try {
                result = Integer.parseInt(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return result;
    }

    public static double getDouble(String msg) {
        double result = 0.0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(msg);
            try {
                result = Double.parseDouble(sc.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid double.");
            }
        }
        return result;
    } 
    
   
}
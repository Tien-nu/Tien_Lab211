/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week5;

import TienLab211.week3.*;
import static TienLab211.week4.GetInput.get;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nguye
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
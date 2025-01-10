/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week1;

import java.util.Scanner;

/**
 *
 * @author nguyenthithuytien
 */
public class Test {
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int choice;
        do{
            System.out.println("-----------------------------");
            System.out.println("1. Linear Search");
            System.out.println("2.Count letter and character.");
            System.out.println("3. Equation.");
            System.out.println("4. Base number.");
            System.out.println("-----------------------------");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  
            switch(choice){
            case 1:                    
                    System.out.println("Number of array: ");
                    int size = sc.nextInt();
                    if(size > 0){
                        LinearSearch linear = new LinearSearch(size);
                        linear.addArray();
                        System.out.println("The array: ");
                        linear.showArray();
                        System.out.println("\nNumber want to search index: ");
                        int number = sc.nextInt();
                        int index = linear.printValue(number);
                        if(index >= 0){
                            System.out.println("Index: " +index);
                        }else{
                            System.out.println("Not exists");
                        }

                    }else{
                        System.out.println("Integer number please.");
                    }
                break;
            case 2:
                System.out.println("String: ");
                String s = sc.nextLine();
                
                CountLetter count = new CountLetter(s);
                System.out.println(count.countWord());
                System.out.println(count.countCharacter());
                break;
            case 3:
                System.out.println("Enter a: ");
                double a = sc.nextDouble();
                System.out.println("Enter b: ");
                double b = sc.nextDouble();
                System.out.println("Enter c: ");
                double c = sc.nextDouble();
                
                Equation eq = new Equation(a, b, c); 
                
                System.out.println("----------------------------------");
                System.out.println("1. Calculate Superlative Equation");
                System.out.println("2. Calculate Quadratic Equation");
                System.out.println("----------------------------------");
                
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        eq.solvePtb1();
                        break;
                    case 2:
                        eq.solvePtb2();
                        break;
                    default:
                        continue;
                }
                break;
            case 4:
                System.out.println("Your input: ");
                String input = sc.next();
                System.out.println("Enter base number input (1 is binary, 2 is decimal, 3 is hexadecimal): ");
                int baseIn = sc.nextInt();
                System.out.println("Enter base number input (1 is binary, 2 is decimal, 3 is hexadecimal): ");
                int baseOut = sc.nextInt();
                BaseNumber base = new BaseNumber(input, baseIn, baseOut);
                base.display();
            }
            
        }while(choice < 5 && choice > 0);
        
        
    }
}

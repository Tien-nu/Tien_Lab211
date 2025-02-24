/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week2;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1. Calculator Program.");
            System.out.println("2. Calculator Shape Program.");
            System.out.println("3. Matrix.");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("===== Caculator Program =====");
                    System.out.println("1. Normal Calculator.");
                    System.out.println("2. BMI Calculator.");
                    System.out.println("3. Exit.");
                    System.out.println("Enter your choice: ");
                    int choice1 = sc.nextInt();
                    
                    CalculatorBMI cal = new CalculatorBMI();
                    
                    switch(choice1){
                        case 1:
                            double memory = 0,num;
                            char operator = '.';
                            while (operator != '='){
                                if (memory == 0){
                                    System.out.println("Enter a number: ");
                                    memory = sc.nextDouble();
                                }
                                
                                System.out.println("Enter an operator: ");
                                operator = sc.next().charAt(0);
                                if(operator == '='){
                                    break;
                                }
                                if(operator != '+' && operator != '-' && operator != '*' &&
                                        operator != '/' && operator != '^'){
                                    continue;
                                }
                                
                                System.out.println("Enter a number: ");
                                num = sc.nextDouble();
                                memory = cal.calculator(memory, operator, num);
                                System.out.println("Memory: " + memory);
                            }
                            System.out.println("Result: " + memory);
                            break;
                        case 2: 
                            double height,weight;
                            System.out.println("Enter height: ");
                            height = sc.nextDouble();
                            System.out.println("Enter weight:");
                            weight = sc.nextDouble();
                            cal.BMICalculate(weight, height);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Please input radius of Circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("Please input side A of Triangle: ");
                    double a = sc.nextDouble();
                    System.out.println("Please input side B of Triangle: ");
                    double b = sc.nextDouble();
                    System.out.println("Please input side C of Triangle: ");
                    double c = sc.nextDouble();
                    System.out.println("Please input side width of Rectangle: ");
                    double width = sc.nextDouble();
                    System.out.println("Please input side height of Rectangle: ");
                    double height = sc.nextDouble();
                    Circle cir = new Circle(radius);
                    Triangle tri = new Triangle(a, b, c);
                    Rectangle re = new Rectangle(width, height);
                    cir.printResult();
                    System.out.println();
                    tri.printResult();
                    System.out.println();
                    re.printResult();
                    break;
                case 3:
                    System.out.println("1. Addition matrix");
                    System.out.println("2. Subtraction matrix");
                    System.out.println("3. Multiplication matrix");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice: ");
                    int choice2 = sc.nextInt();
                    
                    Matrix matrix = new Matrix();
                    int[][] matrix1 = null;
                    int[][] matrix2 = null;

                    switch(choice2){
                        case 1:
                            System.out.println("=== Addition Matrix ===");
                            
                            matrix1 = matrix.getInput();
                            matrix2 = matrix.getInput();
                            
                            matrix.addMatrix(matrix1, matrix2);
                            
                            break;
                        case 2:
                            System.out.println("=== Subtraction ===");
                            
                            matrix1 = matrix.getInput();
                            matrix2 = matrix.getInput();
                            
                            matrix.subtracMatrix(matrix1, matrix2);
                            break;
                        case 3:
                            System.out.println("=== Multiplication matrix ===");
                            
                            matrix1 = matrix.getInput();
                            matrix2 = matrix.getInput();
                            
                            matrix.multiMatrix(matrix1, matrix2);
                            break;
                    }
            }
        }while(choice != 0);
    }
}
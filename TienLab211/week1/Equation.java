/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week1;

/**
 *
 * @author nguyenthithuytien
 */
public class Equation {
    
    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Equation(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    void solvePtb1() {
        if (b == 0) {
            if (c == 0) {
                System.out.println("Many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = -c / b;
            System.out.println("x = " + x);
        }
    }
    void solvePtb2(){
        double delta = Math.pow(b, 2) - (4 * a * c);
        
        if(delta < 0){
            System.out.println("No solution");
        }else if(delta == 0){
            double x1 = -b/(2*a);
            System.out.println("Same solution: " +x1);
        }else if(delta > 0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
        }else{
            System.out.println("Please enter right input");
        }
    }
}

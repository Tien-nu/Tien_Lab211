/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week2;

/**
 *
 * @author nguye
 */
public abstract class Shape {     
    public abstract double getPerimeter();  
    public abstract double getArea();  

    public void printResult() {  
        System.out.println("Perimeter: " + getPerimeter());  
        System.out.println("Area: " + getArea());  
    }  
}
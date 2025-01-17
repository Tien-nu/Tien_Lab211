/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week2;

/**
 *
 * @author nguyenthithuytien
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
    
    public void displayCircle(){
        System.out.println("-----Circle-----");
        System.out.println("Radius of Circle: " + this.radius);
        System.out.println("Area of Circle: " +getArea());
        System.out.println("Perimeter of Circle: " +getPerimeter());
    }
}

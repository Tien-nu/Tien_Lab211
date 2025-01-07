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
        System.out.println("Number of array: ");
        int size = sc.nextInt();
        LinearSearch linear = new LinearSearch(size);
        linear.addArray();
        
        System.out.println("The Array: ");
        linear.showArray();
        
        System.out.println("\nNumber want to search index: ");
        int number = sc.nextInt();
        
        int index = linear.printValue(number);
        System.out.println("Index is: " + index);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week1;

import java.util.Random;

/**
 *
 * @author nguyenthithuytien
 */
public class LinearSearch {
    private int[] array;

    public LinearSearch(int n) {
        this.array = new int[n];
    }
    
    void addArray(){
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(array.length);
        }
    } 
    
    void showArray(){
        for(int n : array){
            System.out.print(n + " ");
        }
    }
    
    int printValue(int number){
        for(int i = 0; i < array.length; i++){
            if (array[i] == number){
                return i;
            }
        }
        return -1;
        
    }
}


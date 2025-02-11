/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week3;

import java.util.Random;

/**
 *
 * @author nguye
 */
public class BubbleSort {

    private int[] arr;
    
    public BubbleSort(int n) {
        arr = new int[n];
        addValue();
    }
    
    void addValue() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(arr.length);
        }
    }
    
    void Sort(){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                }
            }
        }
    }
    
    void display(){
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
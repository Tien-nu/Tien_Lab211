/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week2;

import java.util.Scanner;

/**
 *
 * @author nguyenthithuytien
 */
public class Matrix {
    Scanner sc = new Scanner(System.in);
    
    int[][] getInput(){
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        System.out.println("Enter column: ");
        int column = sc.nextInt();
        
        int[][] newMatrix = new int[row][column];
        for (int i = 0 ; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.println("Enter value for element [" + i + "][" + j + "]:");
                newMatrix[i][j] = sc.nextInt();
            }
        }
        return newMatrix;
    }
    
    void display(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");           
            }
        }
        System.out.println();
        
    }
    
    void addMatrix(int matrix[][], int matrix1[][]){
        int result[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                result[i][j] = matrix[i][j] + matrix1[i][j];
            }
        }
        
        display(matrix);
        System.out.println("+");
        display(matrix1);
        System.out.println("=");
        display(result);
    }
    
    void subtracMatrix(int matrix1[][], int matrix2[][]){
        int resultMatrix[][] = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length ; i++){
            for (int j = 0 ; j < matrix1[i].length; j++){
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        display(matrix1);
        System.out.println("-");
        display(matrix2);
        System.out.println("=");
        display(resultMatrix);
    }
    
    void multiMatrix(int matrix1[][], int matrix2[][]){
        int resultMatrix[][] = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length ; i++){
            for (int j = 0 ; j < matrix2[0].length; j++){
                for (int k = 0; k < matrix1[0].length; k++){
                    resultMatrix[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        display(matrix1);
        System.out.println("*");
        display(matrix2);
        System.out.println("=");
        display(resultMatrix);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week3;

/**
 *
 * @author nguyenthithuytien
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Binary Search");
            System.out.println("4. Stack");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int n1 = GetInput.getInt("Enter number of array: ");
                    BubbleSort sorter = new BubbleSort(n1);
                    System.out.println("Mảng ban đầu:");
                    sorter.displayBubble();
                    sorter.sortBub();
                    System.out.println("Mảng sau khi sắp xếp:");
                    sorter.displayBubble();
                    break;
                case 2:
                    int n2 = GetInput.getInt("Enter number of array");
                    QuickSort quick = new QuickSort(n2);
                    System.out.println("Unsorted array:");
                    quick.displayQuick();
                    System.out.println("Sorted array:");
                    quick.sortQ();
                    quick.displayQuick();
                    break;
                case 3:
                    int n3 = GetInput.getInt("Enter number of array");
                    BinarySearch search = new BinarySearch(n3);
                    System.out.println("Sorted array:");
                    search.displayBinary();
                    int value = GetInput.getInt("Enter search value");
                    int result = search.binarySearch(value);
                    if (result == -1) {
                        System.out.println("Not found");
                    } else {
                        System.out.println("Found " + value + " at index: " + result);
                    }
                    break;
                case 4:
                    MyStack stack = new MyStack();
                    stack.push(0);
                    stack.push(1);
                    stack.push(2);
                    stack.displayStack();
                    stack.pop();
                    stack.displayStack();
                    System.out.println(stack.get());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

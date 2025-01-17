/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week1;

/**
 *
 * @author nguyenthithuytien
 */
public class BaseNumber {
    private String input;
    private int baseIn;
    private int baseOut;

    public BaseNumber(int baseIn, int baseOut, String input) {
        this.input = input;
        this.baseIn = baseIn;
        this.baseOut = baseOut;
    } 
    
    void display(){
        switch(baseIn){
            case 1:
                switch(baseOut){
                    case 1:
                        System.out.println(binToDec());
                        break;
                    case 2:
                        System.out.println(binToHex());
                        break;
                }
            case 2:
                switch(baseOut){
                    case 1:
                        System.out.println(decToBin());
                        break;
                    case 2:
                        System.out.println(decToHex());
                        break;
                }
            case 3:
                switch(baseOut){
                    case 1:
                        System.out.println(hexToBin());
                        break;
                    case 2:
                        System.out.println(hexToDec());
                        break;
                }
        }
    }
    
    int binToDec(){
        int base = 1; 
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--){
            if (input.charAt(i) == '1') {
                result += base;
            }
            base *= 2;
        }
        return result;
    }
    
    String decToBin(){
        int dec = Integer.parseInt(input);
        
        StringBuilder result = new StringBuilder();
        
        if(dec == 0){
            return "0";
        }else{
            while(dec != 0){
                result.insert(0, Integer.toString(dec % 2));
                dec /= 2;
            }
        }
        return result.toString();
    }
    
    String decToHex(){
        char[] digit = { 
            '0', '1', '2', '3', '4', '5', '6', '7', 
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        int dec = Integer.parseInt(input);
        if (dec == 0) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        
        while (dec != 0) {
            result.insert(0 , digit[dec % 16]);
            dec /= 16;
        }
        return result.toString();
    }
    
    int hexToDec(){
        int base = 1;
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--){
            char c = input.charAt(i);
            if (c >= '0' && c <= '9'){
                result = result + base * (int)(c - '0');
            }else{
                result = result + base * (int)(c - 'A' + 10);
            } 
                
            base *= 16;
        }
        return result;
    }
    
    String hexToBin(){
        input = Integer.toString(hexToDec());
        return decToBin();
    }
    
    String binToHex(){
        input = Integer.toString(binToDec());
        return decToHex();
    }
    
    
}

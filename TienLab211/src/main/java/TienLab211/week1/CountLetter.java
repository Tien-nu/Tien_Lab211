/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author nguyenthithuytien
 */
public class CountLetter {
    private String str;

    public CountLetter(String str) {
        this.str = str;
    }
    
    Map<String, Integer> countWord(){
        StringTokenizer tempStr = new StringTokenizer(str);
        HashMap<String, Integer> word = new HashMap<>();
        
        while(tempStr.hasMoreTokens()){
            String tempWord = tempStr.nextToken();
            if(word.containsKey(tempWord)){
                word.put(tempWord, word.getOrDefault(tempWord, 0) + 1);
            }else{
                word.put(tempWord, 1);
            }
        }
        return word;
    }
    
    Map<Character, Integer> countCharacter() {
    HashMap<Character, Integer> tempChar = new HashMap<>();
    for (char c : str.toCharArray()) {
        if (Character.isLetter(c)) { 
            tempChar.put(c, tempChar.getOrDefault(c, 0) + 1);
        }
    }
    return tempChar;
}
}

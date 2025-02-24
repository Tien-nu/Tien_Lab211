/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week4;

import java.time.Year;

/**
 *
 * @author nguye
 */
public class Student2 extends Person{
    private int yearOfAddmission;
    private int englishCore;

    public Student2() {
        super();
        this.yearOfAddmission = 0;
        this.englishCore = 0;
    }

    public int getYearOfAddmission() {
        return yearOfAddmission;
    }

    public void setYearOfAddmission(int addmission) {
        this.yearOfAddmission = addmission;
    }

    public int getEnglishCore() {
        return englishCore;
    }

    public void setEnglishCore(int englishCore) {
        this.englishCore = englishCore;
    }
   
    public void inputAll(){
        super.inputAll();
        
        int currentYear = Year.now().getValue();
        while(true){
            int yearAddmission = GetInput.getInt("Enter year of addmission: ");
            if(yearAddmission >= getYearOfBirth() && yearAddmission <= currentYear){
                setYearOfAddmission(yearAddmission);
                break;
            }else{
                System.out.println("Please enter year between " + getYearOfBirth() + " and " + currentYear);
            }
        }
               
        setEnglishCore(GetInput.getInt("Enter english core: "));
    }

    @Override
    public String toString() {
        return super.toString() + " | Year Of Addmission: " + yearOfAddmission + " | English Core: " + englishCore;
    }
    
    
}

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
public class Person {
    private int id;
    private String fullName;
    private String phoneNumber;
    private int yearOfBirth;
    private String major;

    public Person() {
        this.id = 0;
        this.fullName = "";
        this.phoneNumber = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    
    
    public void inputAll(){ 
        setId(GetInput.getInt("Enter id: "));
        while(true){
            String name = GetInput.get("Enter full name: ");
            
            if(name.matches("[a-zA-Z\\s]+")){
                setFullName(name);
                break;
            }else{
                System.out.println("Please enter alphabet");
            }
        }
  
        String phone = GetInput.get("Enter phone number: ");
        for(int i = 0; i < phone.length(); i++){
            if(phone.length() <= 12){
                setPhoneNumber(phone);
                break;
            }else{
                System.out.println("Please enter 12 digit.");
            }
            
        }
        
        int currentYear = Year.now().getValue();
        int year;
        while(true){
            year = GetInput.getInt("Enter year of birth: ");
            if(year < currentYear){
                setYearOfBirth(year);
                break;
            }else{
                System.out.println("Please enter year before current year.");
            }
        }
        
        String tempMajor = GetInput.get("Enter major: ");
        while(true){
            
                if(tempMajor.length() <= 30){
                    setMajor(tempMajor);
                    break;
                }
            
        }
        
    }

    @Override
    public String toString() {
        return "ID: " + id + " | FullName: " + fullName + " | PhoneNumber=" + phoneNumber 
                + " | Year Of Birth: " + yearOfBirth + " | Major: " + major;
    }
    
    
    
}

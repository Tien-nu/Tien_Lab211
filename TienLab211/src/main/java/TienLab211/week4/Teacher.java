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
public class Teacher extends Person {
    private int yearPro;
    private String contract;
    private double salary;

    public Teacher() {
        super();
        this.yearPro = 0;
        this.contract = "";
        this.salary = 0;
    }

    public int getYearPro() {
        return yearPro;
    }

    public void setYearPro(int yearPro) {
        this.yearPro = yearPro;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void inputAll(){
        super.inputAll();
        
        int age = Year.now().getValue() - getYearOfBirth();
        while(true){
            int tempYearPro = GetInput.getInt("Enter year of profession: ");
            if(tempYearPro >= 0 && tempYearPro < age){
                setYearPro(tempYearPro);
                break;
            }else{
                System.out.println("Please enter year of profession from 0 and lower than age.");
            }
        }
        
        
        while(true){
            String contractType = GetInput.get("Enter contract type: ");
            if(contractType.equals("Long") || contractType.equals("Short")){
                setContract(contractType);
                break;
            }else{
                System.out.println("Please enter contract type Long or Short.");
            }
        }
        
    
        
        setSalary(GetInput.getDouble("Enter salary: "));
        
    }
        

    @Override
    public String toString() {
        return super.toString() + "Year of Professtion: " + yearPro + " | Contract type: " + contract + " | Salary: " + salary ;
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class Test2 extends Menu {
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private ArrayList<Student2> studentList = new ArrayList<>();
    private ArrayList<Person> personList = new ArrayList<>();
    static String[] selection = {
        "Teacher",
        "Student",
        "Person"
    };
    
    public Test2(){
        super("Information Management", selection);
    }  
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                teacher();
                break;
            case 2:
                student();
                break;
            case 3:
                person();
                break;
        }
    }
    
    public void teacher(){
        String[] selectionTeacher = {
            "Input",
            "Print"
        };
        
        Menu menu = new Menu("Teacher Management", selectionTeacher) {
            @Override
            public void execute(int n) {
                switch(n){
                    case 1:
                        Teacher t = new Teacher();
                        t.inputAll();
                        teacherList.add(t);
                        break;
                    case 2:
                        teacherList.sort((t1, t2) -> Integer.compare(t1.getYearPro(), t2.getYearPro()));
                        for(Teacher teach : teacherList){
                            System.out.println("Teacher list are: ");
                            System.out.println(teach);
                        }
                        break;
                }
            }
        };
        menu.run();
    }
    
    public void student(){
        String[] selectionStudent = {
            "Input",
            "Print"
        };
        
        Menu menu = new Menu("Student Management", selectionStudent){
            @Override
            public void execute(int n) {
                switch(n){
                    case 1:
                        Student2 s = new Student2();
                        s.inputAll();
                        studentList.add(s);
                        break;
                    case 2:
                        studentList.sort((s1, s2) -> Integer.compare(s1.getYearOfAddmission(), s2.getYearOfAddmission()));
                        for(Student2 stu : studentList){
                            System.out.println("Student list are: ");
                            System.out.println(stu);
                        }
                        break;
                }
            }
            
        };
        menu.run();
    }
    
    public void person(){
        String[] personSelection = {
            "Search",
            "Print all"
        };
        
        Menu menu = new Menu("Person Management", personSelection){
            List<Person> list = new ArrayList<>();
            @Override
            public void execute(int n) {
                switch(n){
                    case 1:
                        String name = GetInput.get("Enter name of person want to search: ");
                        for(Student2 s : studentList){
                            if(s.getFullName().equalsIgnoreCase(name)){
                                System.out.println(s);
                                break;
                            }else{
                                System.out.println("Don't have that person");
                            }
                        }
                        
                        for(Teacher t : teacherList){
                            if(t.getFullName().equalsIgnoreCase(name)){
                                System.out.println(t);
                                break;
                            }else{
                                System.out.println("Don't have that person");
                            }
                        }
                            
                        break;
                    case 2:
                        personList.sort((p1, p2) -> Integer.compare(p1.getYearOfBirth(), p2.getYearOfBirth()));
                        personList.addAll(teacherList);
                        personList.addAll(studentList);
                        System.out.println(personList);
                        break;
                }
            }
            
        };
        menu.run();
            
    }
    public static void main(String[] args) {
        Test2 menu = new Test2();
        menu.run();
    }
}

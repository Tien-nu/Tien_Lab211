/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week4;

import java.util.List;

/**
 *
 * @author nguye
 */
public class Test extends Menu{
    StudentManagement student = new StudentManagement();
    static String[] selection = {
            "Create", 
            "Find and Sort", 
            "Update/Delete", 
            "Report"
    };
    public Test() {
        super("Student Management Menu",selection);
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                createStudent();
                display(student.getStudent());
                break;
            case 2:
                findSort();
                break;
            case 3:
                deleteAndUpdate();
                break;
            case 4:
                report();
                break;
        }
    }
    
    public void createStudent(){
        int n = GetInput.getInt("Number of student want to add: ");
        for (int i = 0; i < n; i++) {
            String id;

            do {
                id = GetInput.get("Enter id of student: ");
                if (!student.isUniqueID(id)) {
                    System.out.println("ID already exists. Please enter a different ID.");
                }
            } while (!student.isUniqueID(id)); 

            String name = GetInput.get("Enter name of student: ");
            String semester = GetInput.get("Enter semester of student: ");
            String courseName = GetInput.get("Enter course name: ");

            student.create(new Student(id, name, semester, courseName));
        }
    }
    
    public void display(List<Student> stu){
        for(Student student : stu){
            System.out.println(student);
        }
    }
    
    public void findSort() {
        String name = GetInput.get("Name of student want to search: ");
        student.search(name);
        student.sort((s1, s2) -> s1.getStudentName().compareTo(s2.getStudentName()));
        System.out.println("After sort: ");
        display(student.getStudent());
    }
    
    public void deleteAndUpdate(){
        int choice = GetInput.getInt("Enter your choice (1. Delete / 2. Update): ");
        String id = GetInput.get("Enter id of student want to: ");
        
            if(choice == 1){
                student.delete(id);
            }else if(choice == 2){
                String newId = GetInput.get("Id: ");
                String name = GetInput.get("Name: ");
                String semester = GetInput.get("Semester: ");
                String course = GetInput.get("Course name: ");

                student.update(id, newId, name, semester, course);
            }else{
                System.out.println("Invalid choice");
            }
            display(student.getStudent());
        
    }
    
    public void report(){
        student.report();
    }
    
    public static void main(String[] args) {
        Test menu1 = new Test();
        menu1.run();
    }
    
}

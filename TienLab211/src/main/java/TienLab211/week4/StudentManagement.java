/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nguye
 */
public class StudentManagement {
    private ArrayList<Student> sList;
    
    public StudentManagement(){
        sList = new ArrayList<>();
    }
    public void create(Student s){
        sList.add(s);
    }
    
    public List<Student> getStudent(){
        return sList;
    }
    
    public void sort (Comparator<Student> stu){
        Collections.sort(sList, stu);
    }
    
    public List<Student> search(String name){
        List<Student> result = new ArrayList<>();
        for(Student s : sList){
            if(s.getStudentName().equals(name)){
                result.add(s);
            }
        }
        return result;
    }
    
    public void delete(String id){
        sList.removeIf(sList -> sList.getId().equals(id));
    }
    
    public void update(String id, String newId, String name, String semester, String course){
        for(Student s : sList){
            if(s.getId().equals(id)){
                s.setId(newId);
                s.setStudentName(name);
                s.setSemester(semester);
                s.setCourseName(course);
                return;
            }
        }
    }
    
    public void report() {
        System.out.println("Report:");
        
        Map<String, Integer> count = new HashMap<>();
        for(Student s : sList){
            String key = s.getId() + "-" + s.getCourseName();
            count.put(key, count.getOrDefault(key, 0) + 1);
        }
        
        Set<String> print = new HashSet<>();
        for(Student s : sList){
            String key = s.getId() + "-" + s.getCourseName();
            if(!print.contains(key)){
                System.out.println( "Student ID:" + s.getId() + " | Student name: " + s.getStudentName() + 
                         " | Course Name: " + s.getCourseName() + " | Total course: " + count.get(key));
            }
            print.add(key);
        }

    }
    
    public boolean isUniqueID(String id) {
        for (Student s : sList) {
            if (s.getId().equals(id)) {
              return false;
            }
        }
        return true; 
    }

}

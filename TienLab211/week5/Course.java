/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week5;

/**
 *
 * @author nguye
 */
public class Course {
    protected String courseId;
    protected String courseName;
    protected int courseCredit;

    public Course() {
        this.courseId = "";
        this.courseName = "";
        this.courseCredit = 0;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }
    
     public void inputAll(String id, String name, int credit){
        courseId = id;
        courseName = name;
        courseCredit = credit;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + " | Course name: " + courseName + " | Course credit: " + courseCredit ;
    }
    
}

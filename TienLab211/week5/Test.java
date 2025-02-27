/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week5;

/**
 *
 * @author nguye
 */
public class Test extends Menu{
    CourseManagement course;
   
    static String[] selection = {
        "Add online course/offline course",
        "Update course",
        "Delete course",
        "Print all online course, offline course",
        "Search information base on course name"
    };
    public Test(){
        super("Course Management", selection);
        this.course = new CourseManagement();
    }
     @Override
    public void execute(int n) {
        switch(n){
            case 1:
                addCourse();
                break;
            case 2:
                updateCourse();
                break;
            case 3:
                deleteCourse();
                break;
            case 4:
                print();
                break;
            case 5:
                search();
                break;
            case 6:
                System.exit(0);
        }
    }
    
   void addCourse() {
    System.out.println("*** Add new course ***");
    String choice = GetInput.get("Online course or Offline course (O/F): ").toUpperCase();
    if (choice.equals("O")) {
        OnlineCourse onlineC = new OnlineCourse();
        onlineC.inputAll(GetInput.get("Enter course ID:"), 
                GetInput.get("Enter course name:"), 
                GetInput.getInt("Enter course credit:"), 
                GetInput.get("Enter course platform:"), 
                GetInput.get("Enter course instructor:"), 
                GetInput.get("Enter course note:"));
        course.addOnlineCourse(onlineC);
    } else if (choice.equals("F")) {
        OfflineCourse offlineC = new OfflineCourse();
        offlineC.inputAll(GetInput.get("Enter course ID:"), 
                GetInput.get("Enter course name:"), 
                GetInput.getInt("Enter course credit:"), 
                GetInput.getDateInput("Enter begin date:"), 
                GetInput.getDateInput("Enter end date:"), 
                GetInput.get("Enter campus:"));
        course.addOfflineCourse(offlineC);
    } else {
        System.out.println("Invalid choice! Please enter 'O' for Online or 'F' for Offline.");
    }
}

void updateCourse() {
    String courseId = GetInput.get("Enter course ID to update:");
    if (!course.updateCourse(courseId)) {
        System.out.println("Course ID not found!");
    } else {
        System.out.println("Course updated successfully.");
    }
}

void deleteCourse() {
    String courseId = GetInput.get("Enter course ID to delete:");
    if (!course.deleteCourse(courseId)) {
        System.out.println("Course ID not found!");
    } else {
        System.out.println("Course deleted successfully.");
    }
}

void print() {
    String choice;
    do {
        choice = GetInput.get("Do you want to print all (A), online course (O), or offline course (F):").toUpperCase();
    } while (!choice.equals("A") && !choice.equals("O") && !choice.equals("F"));

    if (choice.equals("A")) {
        course.display();
    } else {
        course.display(choice);
    }
}

void search() {
    String courseId = GetInput.get("Enter course name to search:");
    if (!course.search(courseId)) {
        System.out.println("Course ID not found!");
    } else {
        System.out.println("Course found.");
    }
}

    
    public static void main(String[] args) {
       Test menu = new Test();
       menu.run();
    }
}

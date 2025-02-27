/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week5;

/**
 *
 * @author nguye
 */
public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String OnlineNote;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.OnlineNote = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return OnlineNote;
    }

    public void setNote(String OnlineNote) {
        this.OnlineNote = OnlineNote;
    }
    
    public void inputAll(String id, String name, int credit, String pf, String instruc, String note){
        super.inputAll(id, name, credit);
        platform = pf;
        instructors = instruc;
        OnlineNote = note;
    }

    @Override
    public String toString() {
        return super.toString() + " | Platform: " + platform + " | Instructors: " + instructors + " | Online Note: " + OnlineNote;
    }
    
    
}

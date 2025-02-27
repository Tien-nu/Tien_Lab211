/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienLab211.week5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class OfflineCourse extends Course{
    private Date OfflineBegin;
    private Date OfflineEnd;
    private String OfflineCampus;

    public OfflineCourse() {
        super();
        this.OfflineBegin = null;
        this.OfflineEnd = null;
        this.OfflineCampus = "";
    }

    public Date getOfflineBegin() {
        return OfflineBegin;
    }

    public void setOfflineBegin(Date OfflineBegin) {
        this.OfflineBegin = OfflineBegin;
    }

    public Date getOfflineEnd() {
        return OfflineEnd;
    }

    public void setOfflineEnd(Date OfflineEnd) {
        this.OfflineEnd = OfflineEnd;
    }

    public String getOfflineCampus() {
        return OfflineCampus;
    }

    public void setOfflineCampus(String OfflineCampus) {
        this.OfflineCampus = OfflineCampus;
    }
    
    public void inputAll(String id, String name, int credit,
    Date begin, Date end, String campus){
        super.inputAll(id, name, credit);
        OfflineBegin = begin;
        OfflineEnd = end;
        OfflineCampus = campus;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + " | Offline Begin: " + sdf.format(OfflineBegin) + " |  Offline End: " + sdf.format(OfflineEnd) + " | Offline Campus: " + OfflineCampus;
    }
    
    
}

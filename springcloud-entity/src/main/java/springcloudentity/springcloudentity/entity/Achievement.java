package springcloudentity.springcloudentity.entity;

import java.io.Serializable;
import java.util.Date;

public class Achievement implements Serializable {
    private int pId;
    private String perId;
    private String subjectName;
    private int achievement;
    private Date workTime;

    public int getId() {
        return pId;
    }

    public void setId(int id) {
        this.pId = id;
    }

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getAchievement() {
        return achievement;
    }

    public void setAchievement(int achievement) {
        this.achievement = achievement;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "pId=" + pId +
                ", perId='" + perId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", achievement=" + achievement +
                ", workTime=" + workTime +
                '}';
    }
}

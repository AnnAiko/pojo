package lab_6_1;

import java.io.Serializable;

public class Employment implements Serializable {

    private Subject subject;

    private int countStudent;

    private Teacher teaсher;

    private String group;

    public Employment(String group, int countStudent, Subject subject, Teacher teaсher) {
        this.group = group;
        this.countStudent = countStudent;
        this.subject = subject;
        this.teaсher = teaсher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public Teacher getTeaher() {
        return teaсher;
    }

    public void setTeaher(Teacher teaher) {
        this.teaсher = teaher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "ClassPojo [subject = " + subject + ", countStudent = " + countStudent + ", teaher = " + teaсher + ", group = " + group + "]";
    }
}

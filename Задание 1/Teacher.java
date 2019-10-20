package lab_6_1;

import java.io.Serializable;

//Класс Преподаватель
public class Teacher implements Serializable {

    //Количество пар в неделю по каждому предмету
    private int countPairTime;

    private String fio;

    public Teacher(String fio, int countPairTime) {
        this.fio = fio;
        this.countPairTime = countPairTime;
    }

    public int getCountPairTime() {
        return countPairTime;
    }

    public void setCountPairTime(int countPairTime) {
        this.countPairTime = countPairTime;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "ClassPojo [countPairTime = " + countPairTime + ", fio = " + fio + "]";
    }
}

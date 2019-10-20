package lab_6_1;

import java.io.Serializable;

//Класс Предмет
public class Subject implements Serializable {

    private String nameSub;
    private String time;
    private String audience;

    public Subject(String nameSub, String time, String audience) {
        this.nameSub = nameSub;
        this.time = time;
        this.audience = audience;
    }

    public String getNameSub() {
        return nameSub;
    }

    public void setNameSub(String nameSub) {
        this.nameSub = nameSub;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "ClassPojo [nameSub = " + nameSub + ", time = " + time + ", audience = " + audience + "]";
    }
}

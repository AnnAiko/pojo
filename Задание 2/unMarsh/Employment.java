package unmarsh;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;
// задание последовательности элементов XML

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employment", propOrder = {
    "countStudent",
    "subject",
    "teaсher"
})
public class Employment {

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    private String group;
    @XmlElement(required = true)
    private int countStudent;
    @XmlElement(required = true)
    private Subject subject = new Subject();
    @XmlElement(required = true)
    private Teaсher teaсher = new Teaсher();

    public Employment() {
    } // необходим для маршаллизации/демаршалиизации XML

    public Employment(String group, int countStudent, Subject subject, Teaсher teaсher) {
        this.group = group;
        this.countStudent = countStudent;
        this.subject = subject;
        this.teaсher = teaсher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public String toString() {
        return "\nГруппа: " + group + "\nКол-во студентов: " + countStudent
                + subject.toString() + teaсher.toString();
    }

    @XmlRootElement
    @XmlType(name = "subject", propOrder = {
        "nameSub",
        "time",
        "audience"
    })
    // внутренний класс
    public static class Subject {

        private String nameSub;
        private String time;
        private String audience;

        // необходим для маршаллизации/демаршалиизации XML
        public Subject() {
        }

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

        public String toString() {
            return "\n\tНаименование предмета: " + nameSub
                    + "\n\tДень недели: " + time + "\n\tАудитория: " + audience + "\n";
        }
    }
    @XmlRootElement
    @XmlType(name = "teaсher", propOrder = {
        "fio",
        "сountPairTime"
    })
    // внутренний класс
    public static class Teaсher {

        private String fio;
        private int countPairTime;

        // необходим для маршаллизации/демаршалиизации XML
        public Teaсher() {
        }

        public Teaсher(String fio, int countPairTime) {
            this.fio = fio;
            this.countPairTime = countPairTime;
        }

        public String getFio() {
            return fio;
        }

        public void setFio(String fio) {
            this.fio = fio;
        }

        public int getСountPairTime() {
            return countPairTime;
        }

        public void setСountPairTime(int countPairTime) {
            this.countPairTime = countPairTime;
        }

        public String toString() {
            return "\n\tФИО преподавателя: " + fio
                    + "\n\tКол-во пар на недели по предмету: " + countPairTime + "\n";
        }
    }
}

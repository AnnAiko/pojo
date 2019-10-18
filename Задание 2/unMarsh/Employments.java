package unmarsh;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employments {

    @XmlElement(name = "employment")
    private ArrayList<Employment> list = new ArrayList<Employment>();

    public Employments() {
        super();
    }

    public void setList(ArrayList< Employment> list) {
        this.list = list;
    }

    public boolean add(Employment emp) {
        return list.add(emp);
    }

    @Override
    public String toString() {
        return "Employments [list=" + list + "]";
    }
}

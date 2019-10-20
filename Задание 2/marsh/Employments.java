package lab_6_2;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*Класс предназначен для хранения экземпляров класса Employment*/
//Элемент самого верхнего уровня, все остальные элементы лежат в нем
@XmlRootElement
public class Employments {

    //Поле будет представлено XML-элементом
    //Задать имя для тэга
    @XmlElement(name = "employment")
    //Список объектов Employment
    private ArrayList<Employment> list = new ArrayList<Employment>();

    //Конструктор
    public Employments() {
        super();
    }

    //Получить элемент списка
    public void setList(ArrayList< Employment> list) {
        this.list = list;
    }

    //Добавить элемент в список
    public boolean add(Employment emp) {
        return list.add(emp);
    }

    //Преопределить метод 
    @Override
    public String toString() {
        return "Employments [list=" + list + "]";
    }
}

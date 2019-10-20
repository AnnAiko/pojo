package lab_6_2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lab_6_2 {

    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Employments.class);
            Marshaller m = context.createMarshaller();
            //Анонимный класс
            Employments emp = new Employments() {
                {
                    //Добавить первое занятие в расписание
                    Employment.Subject subj = new Employment.Subject("Math", "Tuesday", "Д-504");
                    Employment.Teaсher teach = new Employment.Teaсher("Иванов Иван Иванович", 2);
                    Employment employ = new Employment("PI-1-16", 18, subj, teach);
                    this.add(employ);
                    //Добавить второе занятие в расписание
                    subj = new Employment.Subject("Literature", "Frida", "В-304");
                    teach = new Employment.Teaсher("Силоров Сергей Михайлович", 3);
                    employ = new Employment("ISP-1-17", 25, subj, teach);
                    this.add(employ);
                }
            };
            //Маршализация 
            //Записать объекта в файл
            m.marshal(emp, new FileOutputStream("xmlEmploement.xml"));
            //Вывести на консоль
            m.marshal(emp, System.out);
            System.out.println("XML-файл создан");
            //Если не нашли файл
        } catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        } catch (JAXBException e) {
            System.out.println("JAXB-контекст ошибочен " + e);
        }
    }

}

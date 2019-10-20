package lab_6_3;

import com.example.employments.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

/*Класс для маршализации/демаршализации*/
public class marshDemarsh {

    public void marching() {
        try {
            JAXBContext context = JAXBContext.newInstance(Employments.class);
            Marshaller m = context.createMarshaller();
            //Анонимный класс
            Employments emp = new Employments() {
                {
                    //Добавить первое занятие в расписание
                    Subject subj = new Subject("Math", "Tuesday", "Д-504");
                    Teacher teach = new Teacher("Иванов Иван Иванович", 2);
                    Employment employ = new Employment("PI-1-16", 18, subj, teach);
                    this.add(employ);
                    //Добавить второе занятие в расписание
                    subj = new Subject("Literature", "Frida", "В-304");
                    teach = new Teacher("Силоров Сергей Михайлович", 3);
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

    public void unMarching() {
//Демаршализация
        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance("com.example.employments");
            Unmarshaller um = jc.createUnmarshaller();
            String schemaName = "Schema.xsd";
            SchemaFactory factory
                    = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            File schemaLocation = new File(schemaName);
            // создание схемы и перадача ее демарашаллизатору
            Schema schema = factory.newSchema(schemaLocation);
            um.setSchema(schema);
            Employments st = (Employments) um.unmarshal(new File("newXMLDocument.xml"));
            System.out.println(st);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}

package unmarsh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarsh {

    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Employments.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader("xmlEmploement.xml");
            Employments employments = (Employments) u.unmarshal(reader);
            System.out.println(employments);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

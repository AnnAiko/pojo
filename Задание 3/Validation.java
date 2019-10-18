package lab_6_3;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class Validation {

    //Проверка валидации XML по XSD 
    public void validet() {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "newXMLDocument.xml";
        String schemaName = "Schema.xsd";
        Schema schema = null;
        SchemaFactory factory = SchemaFactory.newInstance(language);

        try {
            // создание схемы
            schema = factory.newSchema(new File(schemaName));
            // создание валидатора на основе схемы          
            Validator validator = schema.newValidator();
            // проверка документа           
            Source source = new StreamSource(fileName);
            validator.validate(source);
            System.out.println("Валидация прошла успешна " + fileName);
        } catch (SAXException e) {
            System.err.println("Валидация файла " + fileName + " на прошел потому, что  "
                    + e.getMessage());
        } catch (IOException e) {
            System.err.print(fileName + " валидация не  " + e.getMessage());
        }
    }
}

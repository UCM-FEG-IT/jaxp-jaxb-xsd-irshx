package xsd.jaxp.jaxb.mstr;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
 
import org.xml.sax.SAXException;

public class validator {
    public static void main(String[] args) {
    try {
      String schemaLang = "http://www.w3.org/2001/XMLSchema";
      SchemaFactory factory = SchemaFactory.newInstance(schemaLang);
      Schema schema = factory.newSchema(new StreamSource("games.xsd"));
      Validator validator = schema.newValidator();
      validator.validate(new StreamSource("games.xml"));
    }catch (SAXException ex) {
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}


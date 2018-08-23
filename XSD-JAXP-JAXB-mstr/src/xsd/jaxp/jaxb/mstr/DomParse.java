package xsd.jaxp.jaxb.mstr;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DomParse {
    
    public static void main(String[] Args) {
     

    try {

	File fXmlFile = new File("C:\\Users\\Jose Nogueira\\Documents\\NetBeansProjects\\GitHub\\jaxp-jaxb-xsd-irshx\\XSD-JAXP-JAXB-mstr\\src\\xsd\\jaxp\\jaxb\\mstr\\games.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
	NodeList nList = doc.getElementsByTagName("game");
			
	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

			System.out.println("Game id : " + eElement.getAttribute("id"));
			System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			System.out.println("Publisher : " + eElement.getElementsByTagName("publisher").item(0).getTextContent());
			System.out.println("Genre : " + eElement.getElementsByTagName("genre").item(0).getTextContent());
			System.out.println("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                        System.out.println("Date Released : " + eElement.getElementsByTagName("date_released").item(0).getTextContent());
		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
  }

}
    


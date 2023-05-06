package adapterPattern.xml;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlFileImpl implements XmlFile {
    private String fileName;

    public XmlFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Document readXmlFile() {
        try {
            File xmlFile = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void writeXmlFile(Document data) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(data);

            // specificarea locatiei unde se va salva fisierul XML
            File file = new File("src/adapterPattern/result/output.xml");
            StreamResult result = new StreamResult(file);

            transformer.transform(source, result);
            System.out.println("Fisierul XML a fost salvat cu succes la locatia: " + file.getAbsolutePath());
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}

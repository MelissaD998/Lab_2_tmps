package adapterPattern.converter;

import adapterPattern.csv.CsvFile;
import adapterPattern.xml.XmlFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.List;

public class CsvToXmlConverter implements FileConverter {

    private CsvFile csvFile;
    private XmlFile xmlFile;

    public CsvToXmlConverter(CsvFile csvFile, XmlFile xmlFile) {
        this.csvFile = csvFile;
        this.xmlFile = xmlFile;
    }

    @Override
    public void convert() {
        List<String[]> csvData = csvFile.readCsvFile();

        // transformarea datelor în XML
        Document xmlData = convertCsvToXml(csvData);

        // scrierea datelor XML
        xmlFile.writeXmlFile(xmlData);
    }

    private Document convertCsvToXml(List<String[]> csvData) {
        // Create a new XML document
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        Document doc = docBuilder.newDocument();

        // Create the root element
        Element rootElement = doc.createElement("data");
        doc.appendChild(rootElement);

        // Create elements for each row of data
        for (String[] row : csvData) {
            Element rowElement = doc.createElement("row");
            rootElement.appendChild(rowElement);

            // Create elements for each column in the row
            for (String value : row) {
                Element columnElement = doc.createElement("column");
                columnElement.appendChild(doc.createTextNode(value));
                rowElement.appendChild(columnElement);
            }
        }

        // Return the XML document
        return doc;
    }
}

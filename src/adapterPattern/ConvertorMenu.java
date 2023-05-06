package adapterPattern;

import adapterPattern.converter.CsvToXmlConverter;
import adapterPattern.converter.FileConverter;
import adapterPattern.csv.CsvFile;
import adapterPattern.csv.CsvFileImpl;
import adapterPattern.xml.XmlFile;
import adapterPattern.xml.XmlFileImpl;

import javax.xml.parsers.ParserConfigurationException;

public class ConvertorMenu {

    public static void main(String[] args) throws ParserConfigurationException {
        CsvFile csvFile = new CsvFileImpl("src/adapterPattern/given/export_4.csv");
        XmlFile xmlFile = new XmlFileImpl("src/adapterPattern/result/output.xml");

        FileConverter csvToXml = new CsvToXmlConverter(csvFile, xmlFile);
        csvToXml.convert();
    }
}

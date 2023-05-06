package adapterPattern.xml;


import org.w3c.dom.Document;

public interface XmlFile {
    Document readXmlFile();

    void writeXmlFile(Document data);
}

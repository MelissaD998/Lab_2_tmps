package adapterPattern.csv;

import java.util.List;

public interface CsvFile {
    List<String[]> readCsvFile();

    void writeCsvFile(List<String[]> data);
}

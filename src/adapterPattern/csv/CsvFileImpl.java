package adapterPattern.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileImpl implements CsvFile {
    private String fileName;

    public CsvFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<String[]> readCsvFile() {
        List<String[]> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                result.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void writeCsvFile(List<String[]> data) {
    }
}

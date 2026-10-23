package parking.refactored;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ParkingLogger {
    private final String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    public void log(String line) throws IOException {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(line + System.lineSeparator());
        }
    }
}

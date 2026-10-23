package parking.refactored;

import java.io.IOException;

public interface ParkingLogger {
    void log(String line) throws IOException;
}

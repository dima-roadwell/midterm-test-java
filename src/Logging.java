import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logging {
    private String fileName;
    private String logString;

    public Logging(String fileName, String logString) throws IOException {
        this.fileName = fileName;
        this.logString = logString;

        this.writeInLog();
    }

    public Logging(String logString) throws IOException {
        this("log.txt", logString);
    }

    private void writeInLog() throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = new File(this.fileName);

        if(!file.exists()) {
            file.createNewFile();
        }

        sb.append(logString).append("\n");

        FileWriter fw = new FileWriter(file, true);
        fw.write(sb.toString());
        fw.close();
    }
}

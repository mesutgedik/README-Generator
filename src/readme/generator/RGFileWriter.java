package readme.generator;

import java.io.File;
import java.io.IOException;

public interface RGFileWriter {
    File generateREADME(RGFileData fileData, String outputFileName) throws IOException;
}

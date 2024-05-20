package core;

import java.io.File;

public class FilePathHandler {
    public static final String dir = System.getProperty("user.dir");
    static File f = new File(dir);
    static String filepath = f.getParent();

    public static final String FileBathInCore = filepath + "/ad_qa_automation/src/test/resources/file";
    public static final String testDataFilePath = FileBathInCore + "/test-data.xlsx";


}

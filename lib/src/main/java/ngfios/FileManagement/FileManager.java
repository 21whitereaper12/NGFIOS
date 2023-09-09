package com.WR.IO.FileManagement;

import java.io.File;
import java.util.HashMap;

public class FileManager implements IFileManager {
    private HashMap<String, File> files = new HashMap<>();
    public FileManager() {
        File file1 = new File("file1.txt");
        files.put("file1.txt", file1);
        files.put("file2.txt", new File("file2.txt"));
        files.put("file3.txt", new File("file3.txt"));

    }
}

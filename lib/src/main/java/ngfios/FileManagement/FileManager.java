package ngfios.FileManagement;

import ngfios.FileExtended.FileExtended;

import java.io.*;
import java.util.HashMap;
import ngfios.FileExtended.*;

public class FileManager {
    private static FileManager instance = null;
    private final HashMap<String, File> files = new HashMap<>();
    private FileManager() {
        FileExtended file1 = new FileExtended("file1.txt");
        files.put("file1.txt", file1);
        files.put("file2.txt", new FileExtended("file2.txt"));
        files.put("file3.txt", new FileExtended("file3.txt"));
    }
    public static FileManager getInstance(){
        if (instance != null)
            instance = new FileManager();
        return instance;
    }
    public FileExtended findOrCreateNewFileOrCacheExisting(String path) throws IOException {
        FileExtended newFile = new FileExtended(path);
        this.files.put(path, newFile);
        return newFile;
    }
    public File getFile(String path) throws IOException {
        if (this.files.containsKey(path))
            return this.files.get(path);
        else
            return this.findOrCreateNewFileOrCacheExisting(path);
    }
}

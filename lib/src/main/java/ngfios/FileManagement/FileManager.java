package ngfios.FileManagement;

import ngfios.FileExtended.FileExtended;

import java.io.*;
import java.nio.file.*;
import java.util.HashMap;

public class FileManager {
    private static FileManager instance = null;
    private HashMap<String, File> files = null;
    private FileManager() {
        this.files = new HashMap<>();
    }
    public static FileManager getInstance(){
        if (instance == null)
            instance = new FileManager();
        return instance;
    }
    public void setStartDirectory(String path) {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path name : dirs) {
            System.out.println(name);
        }
        
    }
    public void getFile(String path) throws IOException {
        FileExtended newFile = new FileExtended(path);
        this.files.put(path, newFile);
    }
}

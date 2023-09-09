package ngfios.FileManagement;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileManager {
    private static FileManager instance = null;
    private final HashMap<String, File> files = new HashMap<>();
    private FileManager() {
        File file1 = new File("file1.txt");
        files.put("file1.txt", file1);
        files.put("file2.txt", new File("file2.txt"));
        files.put("file3.txt", new File("file3.txt"));
    }
    public static FileManager getInstance(){
        if (instance != null)
            instance = new FileManager();
        return instance;
    }
    public File createNewFile(String path) throws IOException {
        File newFile = new File(path);
        if(newFile.createNewFile())
            this.files.put(path, newFile);
        return newFile;
    }
    public File getFile(String path) throws IOException {
        if (this.files.containsKey(path))
            return this.files.get(path);
        else
            return this.createNewFile(path);
    }
}

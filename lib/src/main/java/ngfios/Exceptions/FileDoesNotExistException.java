package ngfios.Exceptions;

import ngfios.FileManagement.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDoesNotExistException extends FileNotFoundException {
    public FileDoesNotExistException(String message) {
        super(message);
    }
    public boolean tryToFix(String pathWhereToCreate){
        try {
            FileManager.getInstance().getFile(pathWhereToCreate);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    // public void 
}
package ngfios.FileExtended;

import ngfios.Exceptions.FileDoesNotExistException;
import ngfios.FileData.*;
import ngfios.ReaderWriter.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExtended extends File {
    private IFileData fileData = null;
    private String path = null;
    private IReader reader = null;
    private IWriter writer = null;
    public FileExtended(String path) {
        this(path, new FileDataDefault());
    }
    public FileExtended(String path, IFileData data) {
        super(path);
        this.reader = new Reader(this);
        this.writer = new Writer();
        this.path = path;
        this.fileData = data;
    }
    public FileExtended(File file) {
        this(file.getPath(), new FileDataDefault());
    }
    public IFileData getFileData() {
        return this.fileData;
    }
    public IFileData getData() {
        return this.fileData;
    }
    public IFileData readData(){
        this.fileData = this.reader.readData();
        return this.fileData;
    }
    public FileReader createFileReader() throws FileNotFoundException {
        boolean noException = false;
        while (true) {
            try {
                return new FileReader(this);
            }
            catch(FileDoesNotExistException e) {
                if(e.tryToFix(this.path))
                    throw new FileNotFoundException(this.path);
            }
        }
    }
    public void writeDown(){
    
    }
}

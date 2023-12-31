package ngfios;

import ngfios.FileData.IFileData;
import ngfios.FileExtended.FileExtended;
import ngfios.FileManagement.FileManager;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FileExtendedTest {
	class FourInts implements IFileData{
		int[] data = null;
		public FourInts() {
            this.data = new int[4];
        }
		
		@Override
		public void forEachLineReader(String line, int lineNumber) {
			this.data[lineNumber] = Integer.parseInt(line);
		}
		@Override
		public String forEachLineWriter(int lineNumber) {
			return Integer.toString(this.data[lineNumber]);
		}
		
	}
	@Test
	public void testReadingOfFile() throws IOException {
		FileExtended file = new FileExtended("test.txt", new FourInts());
		IFileData fileData = file.readData();
	}
}

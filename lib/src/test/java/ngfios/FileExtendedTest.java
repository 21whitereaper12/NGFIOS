package ngfios;

import ngfios.FileData.IFileData;
import ngfios.FileExtended.FileExtended;
import ngfios.FileManagement.FileManager;
import org.junit.jupiter.api.Test;

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
		public void lambdaForEachLine(String line, int lineNumber) {
			this.data[lineNumber] = Integer.parseInt(line);
		}
	}
	@Test
	public void testReadingOfFile() throws IOException {
		FileExtended file = new FileExtended("test.txt", new FourInts());
		IFileData fileData = file.readData();
	}
}

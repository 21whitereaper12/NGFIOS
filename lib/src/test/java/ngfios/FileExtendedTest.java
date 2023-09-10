package ngfios;

import ngfios.FileExtended.FileExtended;
import ngfios.FileManagement.FileManager;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileExtendedTest {
	@Test
	public void testReadingOfFile() throws IOException {
		FileExtended file = new FileExtended(FileManager.getInstance().getFile("./test.txt"));
	}
}

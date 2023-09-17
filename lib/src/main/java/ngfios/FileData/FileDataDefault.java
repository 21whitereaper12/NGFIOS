package ngfios.FileData;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class FileDataDefault extends FileData {
	private ArrayList<String> data = null;
	public FileDataDefault() {
		this.data = new ArrayList<>(0);
	}
	@Override
	public void forEachLineReader(String line, int lineNumber) {
		try {
			this.data.set(lineNumber, line);
		} catch (IndexOutOfBoundsException e) {
			this.data.add(line);
		}
	}
	
	@Override
	public IFileData fullReaderAndParser(String line, int lineNumber) {
		return null;
	}
	
	@Override
	public String forEachLineWriter(int lineNumber) {
		return "";
	}
	
	@Override
	public void fullWriter(BufferedWriter bw) {
		return;
	}
}

package ngfios.FileData;

import java.util.ArrayList;

public class FileDataDefault extends FileData {
	private ArrayList<String> data = null;
	public FileDataDefault() {
		this.data = new ArrayList<>(0);
	}
	@Override
	protected void forEachLineReader(String line, int lineNumber) {
		try {
			this.data.set(lineNumber, line);
		} catch (IndexOutOfBoundsException e) {
			this.data.add(line);
		}
	}
	
	@Override
	protected IFileData fullReaderAndParser(String line, int lineNumber) {
		return null;
	}
	
	@Override
	protected String forEachLineWriter() {
		return null;
	}
	
	@Override
	protected String[] fullWriter() {
		return new String[0];
	}
}

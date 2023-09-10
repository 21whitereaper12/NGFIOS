package ngfios.FileData;

import java.util.ArrayList;

public class FileData implements IFileData{
	/*
	* This is the basic class for reading data, and it is being user for collecting data
	* from a file when needed class not provided
	* */
	ArrayList<String> data = null;
	public FileData() {
		this.data = new ArrayList<String>();
	}

	@Override
	public void lambdaForEachLine(String line, int lineNumber) {
		this.data.add(lineNumber, line);
	}
}

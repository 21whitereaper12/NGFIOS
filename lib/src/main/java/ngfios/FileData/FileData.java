package ngfios.FileData;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FileData{
	/*
	 * This is the basic class for reading data, and it is being user for collecting data
	 * from a file when needed class not provided
	 * */
	public FileData() {}
	protected abstract void forEachLineReader(String line, int lineNumber);
	protected String[] fullReader(BufferedReader bf) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			while (bf.ready())
				lines.add(bf.readLine());
			return this.fromArrayListToArray(lines);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	private String[] fromArrayListToArray(ArrayList<String> arrayList) {
		String[] array = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i);
		}
		return array;
	}
	protected abstract IFileData fullReaderAndParser(String line, int lineNumber);
	protected abstract String forEachLineWriter();
	protected abstract String[] fullWriter();
}

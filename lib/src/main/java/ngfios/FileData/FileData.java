package ngfios.FileData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FileData implements IFileData {
	/*
	 * This is the basic class for reading data, and it is being user for collecting data
	 * from a file when needed class not provided
	 * */
	public FileData() {}
	public abstract void forEachLineReader(String line, int lineNumber);
	public String[] fullReader(BufferedReader bf) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			while (bf.ready())
				lines.add(bf.readLine());
			return this.fromArrayListToArray(lines);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return fromArrayListToArray(lines);
	}
	protected String[] fromArrayListToArray(ArrayList<String> arrayList) {
		String[] array = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i);
		}
		return array;
	}
	public abstract IFileData fullReaderAndParser(String line, int lineNumber);
	public abstract String forEachLineWriter(int lineNumber);
	public abstract void fullWriter(BufferedWriter bw);
}

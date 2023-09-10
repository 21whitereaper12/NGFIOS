package ngfios.ReaderWriter;

import ngfios.FileData.IFileData;
import ngfios.FileExtended.FileExtended;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Reader implements IReader {
	private FileExtended fileExtended = null;
	public Reader(FileExtended fileExtended) {
		this.fileExtended = fileExtended;
	}
	@Override
	public IFileData readData() throws IOException {
		IFileData data = this.fileExtended.getData();
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(this.fileExtended.)
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch (NullPointerException exception) {
			exception.fillInStackTrace();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return data;
	}
}

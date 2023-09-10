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
			bufferedReader = new BufferedReader(this.fileExtended.createFileReader());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
		try {
			for (int i = 0; bufferedReader.ready(); i++) {
				data.lambdaForEachLine(bufferedReader.readLine(), i);
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

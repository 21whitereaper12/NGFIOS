package ngfios.ReaderWriter;

import ngfios.FileData.IFileData;

import java.io.IOException;

public interface IReader {
	public IFileData readData() throws IOException;
}

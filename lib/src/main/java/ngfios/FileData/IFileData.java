package ngfios.FileData;

public interface IFileData {
	public abstract void forEachLineReader(String line, int lineNumber);
	public abstract String forEachLineWriter(int lineNumber);
}

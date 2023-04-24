package composite;

import lombok.Getter;
import lombok.Setter;

public abstract class File {

	@Getter
	@Setter
	private String name;

	public File(String name) {
		this.name = name;
	}
	
	public abstract void ls();
	
	public abstract void addFile(File file);

	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);
}

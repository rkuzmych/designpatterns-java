package composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Directory extends File {

	private List<File> children = new ArrayList<>();
	
	public Directory(String name) {
		super(name);
	}

	@Override
	public void ls() {
		log.info(getName());
		children.forEach(File::ls);
	}

	@Override
	public void addFile(File file) {
		children.add(file);
	}

	@Override
	public File[] getFiles() {
		return children.toArray(new File[children.size()]);
	}

	@Override
	public boolean removeFile(File file) {
		return children.remove(file);
	}
	
}

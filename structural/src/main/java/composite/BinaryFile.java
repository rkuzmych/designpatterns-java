package composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinaryFile extends File {
	
	private long size;
	
	public BinaryFile(String name, long size) {
		super(name);
		this.size = size;
	}

	@Override
	public void ls() {
		log.info(getName() +"\t"+size);
	}

	@Override
	public void addFile(File file) {
		throw new UnsupportedOperationException("Leaf node doesn't support add operation");
	}

	@Override
	public File[] getFiles() {
		throw new UnsupportedOperationException("Leaf node doesn't support get operation");
	}

	@Override
	public boolean removeFile(File file) {
		throw new UnsupportedOperationException("Leaf node doesn't support remove operation");
	}
}

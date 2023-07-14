package com.composite;

// The component base class for composite pattern
// defines operations applicable for both leaf & composite
// composite and leaf node extend from this class.
public abstract class File {

	private String name;

	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void ls(); // Used by leaf
	
	public abstract void addFile(File file); // Used by composite

	public abstract File[] getFiles(); // Used by composite
	
	public abstract boolean removeFile(File file); // Used by composite
}

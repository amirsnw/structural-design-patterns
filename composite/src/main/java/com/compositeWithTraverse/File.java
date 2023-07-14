package com.compositeWithTraverse;

// The component base class for composite pattern
// defines operations applicable for leaf
// composite and leaf node extend from this class.
public abstract class File {

	private String name;

	private File parent;

	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getParent() {
		return this.parent;
	}

	public void setParent(File parent) {
		this.parent = parent;
	}

	public abstract void ls();
}

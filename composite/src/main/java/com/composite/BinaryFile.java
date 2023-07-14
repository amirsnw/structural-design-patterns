package com.composite;

// Leaf node in composite pattern
public class BinaryFile extends File {
	
	private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    public void ls() {
        System.out.println(getName() + "\t" + this.size);
    }

    // If we add child management operation in base component class
    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("The leaf node doesn't support this operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("The leaf node doesn't support this operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("The leaf node doesn't support this operation");
    }
}

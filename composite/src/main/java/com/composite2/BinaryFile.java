package com.composite2;

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
}

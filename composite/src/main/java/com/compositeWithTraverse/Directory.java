package com.compositeWithTraverse;

import java.util.ArrayList;
import java.util.List;

// Composite in the composite pattern
public class Directory extends File {

    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        children.forEach(file -> {
            if (file.getParent() != null) {
                System.out.print(file.getParent().getName() + " >> ");
                file.ls();
            }
        });
    }

    public void addFile(File file) {
        file.setParent(this);
        children.add(file);
    }

    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    public boolean removeFile(File file) { // Implement equal method
        return children.remove(file);
    }
}

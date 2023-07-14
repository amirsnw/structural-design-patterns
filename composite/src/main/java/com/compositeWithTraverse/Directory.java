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
        File file;
        for (int i = 0 ; i < children.size() ; i++) {
            file = children.get(i);
            System.out.print(file.getParent().getName() + " >> ");
            file.ls();

            if (this.getParent() != null && i < children.size() - 1) {
                System.out.print(this.getName().replaceAll(".", " ") + "    ");
            }
        }
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

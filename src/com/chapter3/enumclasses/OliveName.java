package com.chapter3.enumclasses;

public enum OliveName {
    KALMATA("Kalmata"), LIGURIO("Ligurio"), PICHOLINE("Picholine"), GOLDEN("Golden");

    private String nameAsString;

    private OliveName(String nameAsString){
        this.nameAsString = nameAsString;
    }

    @Override
    public String toString() {
        return this.nameAsString;
    }
}

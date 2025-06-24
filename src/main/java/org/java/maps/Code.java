package org.java.maps;

public class Code {
    private String coding;
    private String date;

    public Code(String coding, String date) {
        this.coding = coding;
        this.date = date;
    }

    public Code() {

    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

package com.lambda.javazoo.models;

public class Telephone {

    private long phoneid;

    private String phonetype;

    private String phonenumber;

    private Zoo zoo;

    public Telephone() {
    }

    public Telephone(long phoneid, String phonetype, String phonenumber) {
        this.phoneid = phoneid;
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
    }

    public long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(long phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}

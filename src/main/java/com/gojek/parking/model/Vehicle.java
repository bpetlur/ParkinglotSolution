package com.gojek.parking.model;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {

    private String regNo;
    private String color;

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

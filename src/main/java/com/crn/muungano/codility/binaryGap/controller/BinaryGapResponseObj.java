package com.crn.muungano.codility.binaryGap.controller;

public class BinaryGapResponseObj {
    private String binaryNumber;
    private String binaryGap;

    public BinaryGapResponseObj() {
    }

    public String getBinaryNumber() {
        return binaryNumber;
    }

    public String getBinaryGap() {
        return binaryGap;
    }

    public void setBinaryNumber(String binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    public void setBinaryGap(String binaryGap) {
        this.binaryGap = binaryGap;
    }

    @Override
    public String toString() {
        return "responseObj{" +
                "binaryNumber:'" + binaryNumber + '\'' +
                ", binaryGap:'" + binaryGap + '\'' +
                '}';
    }
}

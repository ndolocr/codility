package com.crn.muungano.codility.binaryGap.dto.response;

import com.crn.muungano.codility.binaryGap.controller.BinaryGapResponseObj;

public class BinaryGapResponseV2DTO {
    private long number;
    private BinaryGapResponseObj responseObj = new BinaryGapResponseObj();

    public BinaryGapResponseV2DTO() {
    }

    public long getNumber() {
        return number;
    }

    public BinaryGapResponseObj getResponseObj() {
        return responseObj;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setResponseObj(BinaryGapResponseObj responseObj) {
        this.responseObj = responseObj;
    }

    @Override
    public String toString() {
        return "{" +
                "number:" + number +
                ", " + responseObj +
                '}';
    }
}

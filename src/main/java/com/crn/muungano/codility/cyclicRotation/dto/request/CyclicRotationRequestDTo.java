package com.crn.muungano.codility.cyclicRotation.dto.request;

import java.util.List;

public class CyclicRotationRequestDTo {
    private int shift;
    private List<Integer> cyclicList;

    public CyclicRotationRequestDTo() {
    }

    public int getShift() {
        return shift;
    }

    public List<Integer> getCyclicList() {
        return cyclicList;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setCyclicList(List<Integer> cyclicList) {
        this.cyclicList = cyclicList;
    }
}

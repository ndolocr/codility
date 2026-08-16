package com.crn.muungano.codility.cyclicRotation.dto.response;

import java.util.List;

public class CyclicRotationResponseDTo {
    // Variables
    private List<Integer> cyclicResponse;

    //Constructor

    public CyclicRotationResponseDTo() {
    }

    public List<Integer> getCyclicResponse() {
        return cyclicResponse;
    }

    public void setCyclicResponse(List<Integer> cyclicResponse) {
        this.cyclicResponse = cyclicResponse;
    }
}

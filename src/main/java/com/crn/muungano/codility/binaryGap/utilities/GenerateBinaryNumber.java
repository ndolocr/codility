package com.crn.muungano.codility.binaryGap.utilities;

import org.springframework.stereotype.Service;

@Service
public class GenerateBinaryNumber {

    public String generateBinary(Long num){
        String value =  Long.toBinaryString(num);
        return value;
    }
}

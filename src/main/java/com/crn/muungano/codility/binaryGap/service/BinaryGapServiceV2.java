package com.crn.muungano.codility.binaryGap.service;

import com.crn.muungano.codility.binaryGap.dto.request.BinaryGapRequestV2DTO;
import com.crn.muungano.codility.binaryGap.dto.response.BinaryGapResponseV2DTO;
import com.crn.muungano.codility.binaryGap.utilities.GenerateBinaryNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BinaryGapServiceV2 {
    // Variables
    GenerateBinaryNumber generateBinaryNumber;
    public BinaryGapServiceV2(GenerateBinaryNumber generateBinaryNumber){
        this.generateBinaryNumber = generateBinaryNumber;
    }

    public BinaryGapResponseV2DTO processBinaryGap(BinaryGapRequestV2DTO request){
        // Declare Variables
        BinaryGapResponseV2DTO binaryGapResponseV2DTO = new BinaryGapResponseV2DTO();
        binaryGapResponseV2DTO.setNumber(request.getNumber());
        // Initiate Variables
        Long number = request.getNumber();
        log.info("Number received from request:- {}", number);

        String binaryNumber = generateBinaryNumber.generateBinary(number);
        log.info("Binary Number generated:- {}", binaryNumber);

        //Check to see if binary number has 2 or less values.
        if (binaryNumber.length() < 3){
            log.info("Binary Number has less than 3 values --> {}", binaryNumber);
            binaryGapResponseV2DTO.getResponseObj().setBinaryGap("0");
            binaryGapResponseV2DTO.getResponseObj().setBinaryNumber(binaryNumber);
            log.info("Response Object --> {}", binaryGapResponseV2DTO.toString());
            return binaryGapResponseV2DTO;
        }

        int intitalCounter = 0;
        int greaterCount = 0;
        for(int x = 0; x<binaryNumber.length(); x++){
            if(binaryNumber.charAt(x) == '1'){
                if(intitalCounter > greaterCount){
                    greaterCount = intitalCounter;
                }
                intitalCounter = 0;
            }else{
                intitalCounter ++;
            }
        }

        binaryGapResponseV2DTO.getResponseObj().setBinaryNumber(binaryNumber);
        binaryGapResponseV2DTO.getResponseObj().setBinaryGap(""+greaterCount);
        return binaryGapResponseV2DTO;
    }
}

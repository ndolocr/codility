package com.crn.muungano.codility.binaryGap.controller;

import com.crn.muungano.codility.binaryGap.dto.request.BinaryGapRequestDTO;
import com.crn.muungano.codility.binaryGap.dto.response.BinaryGapResponseDTO;
import com.crn.muungano.codility.binaryGap.service.BinaryGapService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "binary/gap")
public class Controller {
    // Variables
    private BinaryGapService service;

    //Constructor
    public Controller(BinaryGapService service) {
        this.service = service;
    }

    @PostMapping(path = "/personal")
    public ResponseEntity<BinaryGapResponseDTO> binaryGay(@Valid @RequestBody BinaryGapRequestDTO request){
        BinaryGapResponseDTO response = service.findBinaryGap(request.getNumber());
        System.out.println("GAP-----> "+response.getGap());
        return ResponseEntity.ok().body(response);
    }
}

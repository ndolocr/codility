package com.crn.muungano.codility.cyclicRotation.service;

import com.crn.muungano.codility.cyclicRotation.dto.request.CyclicRotationRequestDTo;
import com.crn.muungano.codility.cyclicRotation.dto.response.CyclicRotationResponseDTo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CyclisRotationService {
    public CyclicRotationResponseDTo rotateList(CyclicRotationRequestDTo request){
        //Create Response Object
        CyclicRotationResponseDTo response = new CyclicRotationResponseDTo();

        //Declare and Initialize variables
        int shift = request.getShift();
        List<Integer> cyclicList = request.getCyclicList();

        //Check if list has a value or if shift is zero
        if (shift == 0 || cyclicList.isEmpty() || cyclicList.size()==1){
            response.setCyclicResponse(request.getCyclicList());
            return response;
        }

        //If list is not empty and shift is not zero or list has more than 1 item
        // move last list element

        // Move all items in new array
        for (int x = 0; x < shift; x++){
            // Initiate new List
            List<Integer> newList = new ArrayList<>();

            // if list has more than 1 item, move last item to first ite of new list
            newList.add(cyclicList.get(cyclicList.size() - 1));

            //Now that we have moved last to first, let us shift the remaininf items.
            for (int y = 0; y < cyclicList.size() - 1; y++){
                newList.add(cyclicList.get(y));
            }
            cyclicList = newList;
        }
        response.setCyclicResponse(cyclicList);
        return response;
    }
}

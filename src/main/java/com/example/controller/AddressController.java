package com.example.controller;

import com.example.service.AddressService;
import com.example.util.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AddressController {
    private static final String ENDPOINT ="/address";
    @Autowired
    private AddressService addressService;

//    @ApiOperation(value="GET STATE RELATED ADDRESSES")
    @GetMapping( value = ENDPOINT +"/{state}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getAddressesForState(@PathVariable("state") States state) {
        List<String> addresses = addressService.getParticularStatePersonWithCityAreaPincode( state.getStates());
        return new ResponseEntity<List<String>> ( addresses , HttpStatus.OK );
    }
}

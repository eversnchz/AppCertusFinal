package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {
    @GetMapping(value ="/grett/{name}")
    public ResponseEntity<String>grett(@PathVariable ("name") String name){
        return new ResponseEntity<>( "Hello " +name, HttpStatus.OK);
    }
}

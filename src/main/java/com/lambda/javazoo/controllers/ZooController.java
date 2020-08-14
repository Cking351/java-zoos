package com.lambda.javazoo.controllers;

import com.lambda.javazoo.models.Zoo;
import com.lambda.javazoo.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {
   @Autowired
   private ZooService zooService;

    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> getZoos() {
        List<Zoo> myList = zooService.getAllZoos();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    @GetMapping(value = "/zoo/{id}", produces = "application/json")
    public ResponseEntity<?> getZooId(@PathVariable long id) {
        Zoo myList = zooService.getById(id);
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}

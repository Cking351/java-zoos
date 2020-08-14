package com.lambda.javazoo.services;

import com.lambda.javazoo.repositories.AnimalRepository;
import com.lambda.javazoo.repositories.ZooRepository;
import com.lambda.javazoo.views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImp implements AnimalService{

    @Autowired
    AnimalRepository animalrepo;

    @Autowired
    ZooRepository zoorepo;

    @Override
    public List<AnimalCounts> findAllZooCounts() {
        List<AnimalCounts> myList = animalrepo.findAllZooCounts();
        return myList;
    }
}

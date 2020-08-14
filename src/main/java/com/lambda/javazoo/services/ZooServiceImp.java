package com.lambda.javazoo.services;

import com.lambda.javazoo.models.Zoo;
import com.lambda.javazoo.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "zooService")
public class ZooServiceImp implements ZooService {

    @Autowired
    ZooRepository zoorepos;

    @Override
    public List<Zoo> getAllZoos() {
        List<Zoo> myList = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(myList::add);
        return myList;
    }

    @Override
    public Zoo getById(long id) {
        return zoorepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ZOO NOT FOUND"));
    }
}

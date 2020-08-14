package com.lambda.javazoo.services;

import com.lambda.javazoo.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class TelephoneServiceImp implements TelephoneService{

    @Autowired
    TelephoneRepository telerepos;
}

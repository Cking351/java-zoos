package com.lambda.javazoo.services;

import com.lambda.javazoo.views.AnimalCounts;

import java.util.List;

public interface AnimalService {
    List<AnimalCounts> findAllZooCounts();
}

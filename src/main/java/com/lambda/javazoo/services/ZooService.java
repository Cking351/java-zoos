package com.lambda.javazoo.services;

import com.lambda.javazoo.models.Zoo;

import java.util.List;

public interface ZooService {
    List<Zoo> getAllZoos();

    Zoo getById(long id);
}

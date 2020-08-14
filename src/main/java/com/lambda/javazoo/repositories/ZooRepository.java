package com.lambda.javazoo.repositories;

import com.lambda.javazoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}

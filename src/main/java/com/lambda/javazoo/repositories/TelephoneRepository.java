package com.lambda.javazoo.repositories;

import com.lambda.javazoo.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {
}

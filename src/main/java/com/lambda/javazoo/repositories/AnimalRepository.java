package com.lambda.javazoo.repositories;

import com.lambda.javazoo.models.Animal;
import com.lambda.javazoo.views.AnimalCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    @Query(value = "SELECT  a.animaltype as animaltype, count(z.zooid) as zoocounts " +
            "FROM ANIMALS a LEFT JOIN  ZOOANIMALS z ON a.animalid = z.animalid " +
            "GROUP BY a.ANIMALTYPE " +
            "ORDER BY zoocounts desc", nativeQuery = true)
    List<AnimalCounts> findAllZooCounts();
}


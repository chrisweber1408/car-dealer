package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CarShopRepository extends MongoRepository<Car, String> {

    Optional<Car> findById(String id);

}

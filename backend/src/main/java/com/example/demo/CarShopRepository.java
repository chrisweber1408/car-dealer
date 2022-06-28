package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarShopRepository extends MongoRepository<Car, String> {

}

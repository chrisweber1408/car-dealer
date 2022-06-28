package com.example.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarShopService {

    private final CarShopRepository carShopRepository;
    public void addOne(Car car) {
        carShopRepository.save(car);
    }

    public List<Car> getAll() {
        return carShopRepository.findAll();
    }

    public Car getOne(String id) {
        return carShopRepository.findById(id).orElseThrow();
    }
}

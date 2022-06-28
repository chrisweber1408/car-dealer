package com.example.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shop")
@RequiredArgsConstructor
public class CarShopController {

    private final CarShopService carShopService;

    @PostMapping
    public void addOneCar(@RequestBody Car car){
        carShopService.addOne(car);
    }

    @GetMapping
    public List<Car> getAllCars(){
        return carShopService.getAll();
    }

    @GetMapping("/{id}")
    public Car getOneCar(@PathVariable String id){
        return carShopService.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOneCar(@PathVariable String id){
        carShopService.deleteOne(id);
    }

}

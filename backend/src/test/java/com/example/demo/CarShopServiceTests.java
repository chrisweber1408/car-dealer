package com.example.demo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CarShopServiceTests {

    @Test
    void shouldAddOneCar(){
        //given
        Car car1 = new Car("1", "Audi", "A4", 123);
        CarShopRepository carShopRepository = Mockito.mock(CarShopRepository.class);
        CarShopService carShopService = new CarShopService(carShopRepository);
        //when
        carShopService.addOne(car1);
        //then
        Mockito.verify(carShopRepository).save(car1);
    }

    @Test
    void shouldGetAllCars(){
        //given
        Car car1 = new Car("1", "VW", "Gold", 300);
        Car car2 = new Car("2", "VW", "Gold", 150);
        CarShopRepository carShopRepository = Mockito.mock(CarShopRepository.class);
        CarShopService carShopService = new CarShopService(carShopRepository);
        Mockito.when(carShopRepository.findAll()).thenReturn(List.of(car1, car2));
        //when
        Collection<Car> actual = carShopService.getAll();
        //
        Assertions.assertThat(actual).hasSize(2);
        Assertions.assertThat(actual).isEqualTo(List.of(car1, car2));
    }

    @Test
    void shouldDeleteOneCarById(){
        //
        Car car1 = new Car("1", "VW", "Gold", 300);
        CarShopRepository carShopRepository = Mockito.mock(CarShopRepository.class);
        CarShopService carShopService = new CarShopService(carShopRepository);
        //
        carShopService.deleteOne("1");
        //
        Mockito.verify(carShopRepository).deleteById("1");
    }

    @Test
    void shouldGetOneCarByID(){
        //
        Car car1 = new Car("1", "VW", "Gold", 300);
        Car car2 = new Car("2", "VW", "Gold", 150);
        CarShopRepository carShopRepository = Mockito.mock(CarShopRepository.class);
        CarShopService carShopService = new CarShopService(carShopRepository);
        Mockito.when(carShopRepository.findById("1")).thenReturn(Optional.of(car1));
        //
        Car actual = carShopService.getOne("1");
        //
        Assertions.assertThat(actual).isEqualTo(car1);
    }
}

package com.example.test_rest2dbh2.service;


import com.example.test_rest2dbh2.enity.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    List<Car> getAllCars();

    Car getCar(int id);

    Car saveCar(Car car);

    void deleteCar(int id);
}

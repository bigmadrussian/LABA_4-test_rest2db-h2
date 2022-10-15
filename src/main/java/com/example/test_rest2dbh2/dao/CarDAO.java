package com.example.test_rest2dbh2.dao;

import com.example.test_rest2dbh2.enity.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDAO {

    List<Car> getAllCars();

    Car saveCar(Car car);

    Car getCar(int id);

    void deleteCar(int id);
}

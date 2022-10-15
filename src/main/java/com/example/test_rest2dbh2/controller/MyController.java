package com.example.test_rest2dbh2.controller;


import com.example.test_rest2dbh2.enity.Car;
import com.example.test_rest2dbh2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> showStudents() {
        List<Car> allCars = carService.getAllCars();
        return allCars;
    }

    @GetMapping("/cars{id}")
    public Car getCars(@PathVariable("id") int id) {
        return carService.getCar(id);
    }

    @PostMapping("/cars")
    public Car saveCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping("/cars")
    public Car updateCar(@RequestBody Car car) {
        carService.saveCar(car);
        return car;
    }

    @DeleteMapping("/cars/{id}")
    public void updateCar(@PathVariable("id") int id) {
        carService.deleteCar(id);
    }
}

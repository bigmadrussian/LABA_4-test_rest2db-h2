package com.example.test_rest2dbh2.service;

import com.example.test_rest2dbh2.dao.CarDAO;
import com.example.test_rest2dbh2.enity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    @Transactional
    public Car getCar(int id) {
        return carDAO.getCar(id);
    }

    @Override
    @Transactional
    public Car saveCar(Car car) {
        return carDAO.saveCar(car);
    }

    @Override
    @Transactional
    public void deleteCar(int id) {
        carDAO.deleteCar(id);
    }

}

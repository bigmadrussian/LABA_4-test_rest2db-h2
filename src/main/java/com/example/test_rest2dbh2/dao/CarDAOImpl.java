package com.example.test_rest2dbh2.dao;


import com.example.test_rest2dbh2.enity.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Slf4j
@Repository
public class CarDAOImpl implements CarDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Car> getAllCars() {

        Query query = entityManager.createQuery("from Car");
        List<Car> allCars = query.getResultList();
        log.info("getAllCars" + allCars);
        return allCars;
    }

    @Override
    public Car saveCar(Car car) {
        return entityManager.merge(car);
    }

    @Override
    public Car getCar(int id) {
        return entityManager.find(Car.class, id);
    }

    @Override
    public void deleteCar(int id) {
        Query query = entityManager.createQuery("delete from Car " + " where id =:carId");
        query.setParameter("carId", id);
        query.executeUpdate();
    }
}

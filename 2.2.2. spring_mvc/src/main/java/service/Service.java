package service;

import web.controller.CarController;
import web.model.Car;

import java.util.List;

public interface Service {
    List<Car> getNumberOfCars(Integer count, List<Car> cars);
}

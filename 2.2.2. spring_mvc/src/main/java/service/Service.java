package service;

import web.controller.CarController;

import java.util.List;

public interface Service {
    List<CarController> getNumberOfCars(Integer count, List<CarController> cars);
}

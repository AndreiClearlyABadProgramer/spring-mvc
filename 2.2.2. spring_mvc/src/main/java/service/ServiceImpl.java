package service;

import web.controller.CarController;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {
    @Override
    public List<CarController> getNumberOfCars(Integer count, List<CarController> cars) {
        List<CarController> carsCount = new ArrayList<>();
        if (count == null) {
            count = 5;
        }
        if (count > 5) {
            count = 5;
        }
        for (int i = 0; i < count; i++) {
            carsCount.add(cars.get(i));
        }
        return carsCount;
    }
}

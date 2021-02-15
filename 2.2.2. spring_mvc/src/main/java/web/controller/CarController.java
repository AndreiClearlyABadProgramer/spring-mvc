package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;
import service.ServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          ModelMap model){
        Service service = new ServiceImpl();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 1, "name1"));
        cars.add(new Car("car2", 2, "name2"));
        cars.add(new Car("car3", 3, "name3"));
        cars.add(new Car("car4", 4, "name4"));
        cars.add(new Car("car5", 5, "name5"));
        List<Car> calledCars = service.getNumberOfCars(count, cars);
        model.addAttribute("cars", calledCars);
        return "cars";
    }

}

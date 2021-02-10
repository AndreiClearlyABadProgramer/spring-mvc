package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;
import service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private String model;
    private int series;
    private String ownerName;

    public CarController(){

    }

    public CarController(String model, int series, String ownerName){
        this.model = model;
        this.series = series;
        this.ownerName = ownerName;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          ModelMap model){
        Service service = new ServiceImpl();
        List<CarController> cars = new ArrayList<>();
        cars.add(new CarController("car1", 1, "name1"));
        cars.add(new CarController("car2", 2, "name2"));
        cars.add(new CarController("car3", 3, "name3"));
        cars.add(new CarController("car4", 4, "name4"));
        cars.add(new CarController("car5", 5, "name5"));
        List<CarController> calledCars = service.getNumberOfCars(count, cars);
        model.addAttribute("cars", calledCars);
        return "cars";
    }

}

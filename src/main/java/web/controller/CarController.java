package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("VAZ", "RED", 2000));
        list.add(new Car("GAZ", "YELLOW", 1995));
        list.add(new Car("UAZ", "BLACK", 2010));
        list.add(new Car("KAMAZ", "GREEN", 2020));
        list.add(new Car("LUAZ", "BLUE", 1985));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";

    }
}

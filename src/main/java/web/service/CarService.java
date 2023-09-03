package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarService implements Cars {
    private List<Car> list  = new ArrayList<>();

    public List<Car> carList (){

        list.add(new Car("VAZ", "RED", 2000));
        list.add(new Car("GAZ", "YELLOW", 1995));
        list.add(new Car("UAZ", "BLACK", 2010));
        list.add(new Car("KAMAZ", "GREEN", 2020));
        list.add(new Car("LUAZ", "BLUE", 1985));
        return list;
    }

    @Override
    public List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5)
           return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }


}

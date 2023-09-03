package web.service;

import web.model.Car;

import java.util.List;

public interface Cars {
   List<Car> carList ();

   List<Car> carsCount(List<Car> list, int number) ;

}

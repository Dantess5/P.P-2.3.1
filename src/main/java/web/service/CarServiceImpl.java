package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Logan", 1999, "black"));
        cars.add(new Car("Camry", 1988, "red"));
        cars.add(new Car("Vesta", 2012, "white"));
        cars.add(new Car("Rio", 2005, "grey"));
        cars.add(new Car("lamborghini", 2022, "blue"));
    }

    @Override
    public List<Car> getCars(int a) {
        if(a > 5) {
            return cars;
        } else if (a < 1) {
            return null;
        }
        return cars.subList(0, a);
    }
}































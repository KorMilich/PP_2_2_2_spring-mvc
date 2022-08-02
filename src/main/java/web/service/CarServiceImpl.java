package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> car = new ArrayList<>();
    private static int idCount = 0;

    {
        car.add(new Car(++idCount, "Mazda", 1.4f));
        car.add(new Car(++idCount, "Nissan", 1.6f));
        car.add(new Car(++idCount, "Cherry", 1.8f));
        car.add(new Car(++idCount, "UAZ", 2.0f));
        car.add(new Car(++idCount, "Skoda", 1.2f));
    }


    public List<Car> getCarList() {
        return car;
    }
    public List<Car> getCarsNumber(int count) {
        return car.stream().limit(count).toList();// Слушай, помоему через стрим лучше, тк как при вводе большего числа чем есть в списке, он вернет просто полный список.
//        return car.subList(0,count);    а если черех subList, то потребуется доп обработка на исключение IndexOutOfBoundsException
    }
}

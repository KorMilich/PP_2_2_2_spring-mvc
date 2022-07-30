package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller

public class CarsController {

    private CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String show(@RequestParam(name = "count", required = false) Integer count,
                       Model model) {
        if (count == null) {
            model.addAttribute("cars", carService.getCarList());
        } else {
            model.addAttribute("cars", carService.getCarsNumber(count));
        }
        return "cars";

    }
}

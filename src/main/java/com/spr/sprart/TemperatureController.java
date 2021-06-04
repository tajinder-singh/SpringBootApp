package com.spr.sprart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TemperatureController {

    @GetMapping("/convert")
    @ResponseBody
    public double GetTemperature(@RequestParam double temperature, String unit) {
        if (unit.equals("F"))
            return (temperature - 32) * (5.0 / 9.0);
        else
            return (temperature * (9.0 / 5.0)) + 32;

    }

    @GetMapping("/compare")
    @ResponseBody
    public int CompareNumbers(@RequestParam int num1, int num2) {

        if (num1 > num2)
            return num1;
        else
            return num2;

    }
System.out.println("fkdfkdjfkd");

}

package com.calc.calcapp.controller;

import com.calc.calcapp.calcInterface.ServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    ServiceInterface serviceInterface = new ServiceInterface() {
        @Override
        public String toGreet() {
            return null;
        }

        @Override
        public String plus(Integer num1, Integer num2) {
            return null;
        }

        @Override
        public String minus(Integer num1, Integer num2) {
            return null;
        }

        @Override
        public String multiply(Integer num1, Integer num2) {
            return null;
        }

        @Override
        public String divide(Integer num1, Integer num2) {
            return null;
        }
    };
    @GetMapping()
    public String toGreet() {
        return serviceInterface.toGreet();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2 ) {
        return serviceInterface.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2 ) {
        return serviceInterface.minus(num1, num2);

    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2 ) {
        return serviceInterface.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2 ) {
        return serviceInterface.divide(num1, num2);
    }
}
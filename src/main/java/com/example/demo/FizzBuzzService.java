package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public String getWord(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }

        return Integer.toString(number);
    }
}

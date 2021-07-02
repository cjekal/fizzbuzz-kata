package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private FizzBuzzService fizzBuzzService;

	@Test
	void GetsFizzIfDivisibleBy3() {
		assertThat(fizzBuzzService.getWord(3)).isEqualTo("fizz");
		assertThat(fizzBuzzService.getWord(6)).isEqualTo("fizz");
		assertThat(fizzBuzzService.getWord(12)).isEqualTo("fizz");
	}

	@Test
	void GetsBuzzIfDivisibleBy5() {
		assertThat(fizzBuzzService.getWord(5)).isEqualTo("buzz");
		assertThat(fizzBuzzService.getWord(10)).isEqualTo("buzz");
		assertThat(fizzBuzzService.getWord(20)).isEqualTo("buzz");
	}

	@Test
	void GetsItselfWhenNeitherDivisibleBy3Nor5() {
		assertThat(fizzBuzzService.getWord(1)).isEqualTo("1");
		assertThat(fizzBuzzService.getWord(4)).isEqualTo("4");
		assertThat(fizzBuzzService.getWord(11)).isEqualTo("11");
	}

	@Test
	void GetsFizzBuzzWhenDivisibleByBoth3And5() {
		assertThat(fizzBuzzService.getWord(15)).isEqualTo("fizzbuzz");
		assertThat(fizzBuzzService.getWord(30)).isEqualTo("fizzbuzz");
		assertThat(fizzBuzzService.getWord(90)).isEqualTo("fizzbuzz");
	}
}

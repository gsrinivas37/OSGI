package com.example.provider2;

import com.example.service.Greeting;

public class GreetingImpl2 implements Greeting {
	@Override
	public void greet() {
		System.out.println("Greeting from GreetingImpl Provider 2");
	}
}

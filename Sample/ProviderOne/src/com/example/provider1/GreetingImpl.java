package com.example.provider1;

import com.example.service.Greeting;

public class GreetingImpl implements Greeting {
	@Override
	public void greet() {
		System.out.println("Greeting from GreetingImpl Provider 1");
	}
}

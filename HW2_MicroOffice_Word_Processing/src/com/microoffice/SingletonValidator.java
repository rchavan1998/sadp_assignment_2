package com.microoffice;

import java.util.HashMap;
import java.util.Map;

public class SingletonValidator {
	private static final Map<String, Integer> instances = new HashMap<>();
	//fetch number of instances
	public static int getNumberOfInstances(String wordGeneration) {
		instances.putIfAbsent(wordGeneration, 0);
		instances.put(wordGeneration, instances.get(wordGeneration) + 1);
			//count check
		if (instances.get(wordGeneration) > 2) {
			System.out.println("Please note that the following version is being tested more than twice -> " + wordGeneration );
		}

		return instances.get(wordGeneration);
	}

}

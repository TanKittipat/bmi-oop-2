package com.npruse65.id023;

public class BmiIndexer {
	public double calculateBMI(double height, double weight) {
		double result = (weight / (height * height) * 10000);
		return result;
	}
}

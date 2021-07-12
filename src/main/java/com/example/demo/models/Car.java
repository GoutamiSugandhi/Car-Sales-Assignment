package com.example.demo.models;

	import org.springframework.stereotype.Component;

	@Component
	public class Car implements Comparable<Car> {
		
		private String model;
		private int year;
		private String kms;
		
		public Car() {
			super();
		}

		public Car(String model, int year, String kms) {
			super();
			this.model = model;
			this.year = year;
			this.kms = kms;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year=year;
		}

		public String getKms() {
			return kms;
		}

		public void setKms(String kms) {
			this.kms = kms;
		}

		@Override
		public String toString() {
			return "Car [model=" + model + ", year=" + year + ", kms=" + kms + "]";
		}

		@Override
		public int compareTo(Car o) {
			// TODO Auto-generated method stub
			return 0;
		}

	}	

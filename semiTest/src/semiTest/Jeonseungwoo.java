package semiTest;

import java.util.Objects;

public class Jeonseungwoo {
	private String name;
	private int age;
	private double weight;
	public Jeonseungwoo() {
		// TODO Auto-generated constructor stub
	}
	public Jeonseungwoo(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jeonseungwoo other = (Jeonseungwoo) obj;
		return age == other.age && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
}

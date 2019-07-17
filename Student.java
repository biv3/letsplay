package day3;

public class Student {

	private String name;
	private int age;
	private float marks1;
	private float marks2;
	private float marks3;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks1=" + marks1
				+ ", marks2=" + marks2 + ", marks3=" + marks3 + "]";
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

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public float getMarks3() {
		return marks3;
	}

	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}
	public float calculateTotal(){
		float total;
		total = this.marks1 + this.marks2 + this.marks3;
		return total;
	}
	public float calculateAverage(){
		float avg;
		avg = this.marks1 + this.marks2 + this.marks3/3;
		return avg;
	}
}

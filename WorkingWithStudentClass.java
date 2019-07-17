package day3;

import java.util.Scanner;

public class WorkingWithStudentClass {
	public static void main(String[] args) {
		String name[] = {"Arjun","Varun","Ruby","Neha","Karan","Priya"};
		String name2;
		int age[] = {18,20,25,22,17,21};
		int age2;
		float marks1[] = {33,56,89,37,44,79};
		float marks2[] = {89,37,44,33,56,79};
		float marks3[] = {39,52,84,37,44,79};
		
		Student stu[] = new Student[6] ;
		Scanner scan = new Scanner(System.in);
		/*for(int i =0;i<6;i++){
		stu[i] = new Student();
		
		stu[i].setName(name[i]);
		stu[i].setAge(age[i]);
		stu[i].setMarks1(marks1[i]);
		stu[i].setMarks2(marks2[i]);
		stu[i].setMarks3(marks3[i]);
		}*/
		for(int i =0;i<6;i++){
			stu[i] = new Student();
			System.out.println("Enter name: ");
			name2 = scan.next();
			stu[i].setName(name2);
			System.out.println("Enter age: ");
			age2 = scan.nextInt();
			stu[i].setAge(age2);
			stu[i].setMarks1(marks1[i]);
			stu[i].setMarks2(marks2[i]);
			stu[i].setMarks3(marks3[i]);
			}
		
		System.out.println("The details entered by you are:");
		for(int i =0;i<6;i++){
		System.out.println("Name :"+stu[i].getName());
		System.out.println("Age :"+stu[i].getAge());
		System.out.println("Marks 1 :"+stu[i].getMarks1()+" Marks 2 :"+stu[i].getMarks2()+" Marks 3 :"+stu[i].getMarks3());
		System.out.println("Total:"+stu[i].calculateTotal());
		System.out.println("Average:"+stu[i].calculateAverage());
		System.out.println("\n");
		}
	}
}

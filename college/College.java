package org.college;

public class College {
	public void collegeName() {
		
		System.out.println("NEC");

	}
	public void collegeCode() {
		System.out.println("2270");

	}
	public void collegeRank() {
		System.out.println("second tier");

	}
	
	public static void main(String[] args) {
		College obj=new College();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
	}

}

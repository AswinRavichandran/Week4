package week4.day3;

public class Students {
	
	public void getStudentinfo(String name) {
		System.out.println("Student name:"+name);
	
	}
	public void getStudentinfo(String name,int StudentId) {
		System.out.println("String name:"+name+" "+"StudentId:"+StudentId);
		
	}
	
	public void getStudentinfo(String name,long PhoneNumber) {
		System.out.println("Student name:"+name+" "+" PhoneNumber:"+PhoneNumber);
		
	}
	public void getStudentinfo(int phoneNumber,String email) {
		System.out.println("Phone Number:"+phoneNumber+" "+" Mail ID:"+email);
		
	}
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentinfo("Aswin");
		stu.getStudentinfo("Aswin", 18006);
		stu.getStudentinfo("Aswin", 790483691);
		stu.getStudentinfo(790483695, "raviaswin2406@gmail.com");
	}

}

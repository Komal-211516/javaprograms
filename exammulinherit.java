interface exam{
	void allowExam();
}
interface attendance{
	boolean hasRequiredAttendance();
}
class Student implements exam, attendance{
	int attend;
	String name;
	Student (String name, int attendance){
		this.attend=attendance;
		this.name=name;
	}
	public boolean hasRequiredAttendance(){
		return attend >=75;
	}
	public void allowExam(){
		if(hasRequiredAttendance()){
			System.out.println(name+"is allowed for exam.");
		}else{
			System.out.println(name+"is not allowed for exam.");
		}
	}
}
public class exammulinherit{
	public static void main(String[] args){
		Student s1=new Student("xyz",65);
		s1.allowExam();
		Student s2=new Student("Komal", 86);
		s2.allowExam();
	}
}
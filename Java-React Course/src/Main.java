
public class Main {

	
	public static void main(String[] args) {
		User user = new User();
		Student student = new Student();
		Instructor ins = new Instructor();
		
		student.FirstName="enes";
		student.bolum="bilgisayar muh";
		ins.FirstName="omer";
		ins.Alan="mobil";
		
		
		UserManager usrmngr = new UserManager();
		StudentManager stdntmngr = new StudentManager();
		InsManager insmngr = new InsManager();
		
		insmngr.alandegis(ins,"yapay zeka");
		stdntmngr.bolumdegis(student,"makine muh");
		
	}
}

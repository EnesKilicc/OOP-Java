
public class StudentManager extends UserManager {

	public void bolumdegis(Student student,String bolum) {
		student.bolum=bolum;
		
		System.out.println(student.bolum + " o�renci b�l�m� dei�tirildi");
		
	}
	public void ekle(Student student) {
		System.out.println(student.FirstName + " isimli ogrenci eklendi");
	}
	
}

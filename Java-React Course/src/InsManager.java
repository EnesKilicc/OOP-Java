
public class InsManager extends UserManager {
	 public void alandegis(Instructor ins,String alan) {
		 ins.Alan=alan;
		 
		 System.out.println(ins.FirstName + ins.Alan + " alaný deiþtirildi");
	 }
	 public void ekle(Instructor ins) {
			System.out.println(ins.FirstName + "egitmen eklendi");
		}
	 

}

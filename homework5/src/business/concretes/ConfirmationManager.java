package business.concretes;


import java.util.Scanner;

import business.abstracts.ConfirmationService;

public class ConfirmationManager implements ConfirmationService {

	@Override
	public void message(String receiver, String message) {
		boolean kontrol = true;
		while(kontrol) {
			System.out.println("LÜTFEN E-MAÝLÝNÝZÝ GÝRÝNÝZ");
			System.out.println("MAÝL:" + receiver);
			System.out.println("ONAY KODU: " + message);
		Scanner input = new Scanner(System.in);
		System.out.println("LÜTFEN E-MALÝNÝZE GÖNDERÝLEN DOÐRULAMA KODUNU GÝRÝNÝZ");
		String confirmCode = input.next();
		
		if(confirmCode.equals("123")) {
			System.out.println("HESABINIZ ONAYLANDI");
			kontrol = false;
		} else {
			System.err.println("GÝRÝLEN KOD YANLIÞ HESABINIZ ONAYLANMADI");
		}
	}
	}
}


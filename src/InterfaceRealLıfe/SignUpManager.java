package InterfaceRealL�fe;

public class SignUpManager {
	private IUserCheckService user;
	

	public SignUpManager(IUserCheckService user) {
		this.user = user;
	}



	public void signUp(User user1) {
		//AGEUSER'I KULLANCAZ BURDA
	//	AgeUserCheckService ageUser = new AgeUserCheckService(); //B�YLE YAPARAK BA�IMLI OLUYORUZ
		                                                         //O Y�ZDEN SOYUTLAMAK GEREK�YOR
		
		
		/*
		if(ageUser.checkUser(user1)) {
			System.out.println("Kullan�c� kay�t oldu..." + user1.getName());
		}else {
			System.out.println("Kullan�c� kay�t olamad�...");
		}	
	}*/
		if(user.checkService(user1)) {
			System.out.println( user1.getName() +" adl� kullan�c� kay�t oldu.");
		}else {
			System.out.println("Kullan�c� kay�t olamad�.");
		}
		

}


}
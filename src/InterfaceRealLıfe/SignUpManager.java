package InterfaceRealLýfe;

public class SignUpManager {
	private IUserCheckService user;
	

	public SignUpManager(IUserCheckService user) {
		this.user = user;
	}



	public void signUp(User user1) {
		//AGEUSER'I KULLANCAZ BURDA
	//	AgeUserCheckService ageUser = new AgeUserCheckService(); //BÖYLE YAPARAK BAÐIMLI OLUYORUZ
		                                                         //O YÜZDEN SOYUTLAMAK GEREKÝYOR
		
		
		/*
		if(ageUser.checkUser(user1)) {
			System.out.println("Kullanýcý kayýt oldu..." + user1.getName());
		}else {
			System.out.println("Kullanýcý kayýt olamadý...");
		}	
	}*/
		if(user.checkService(user1)) {
			System.out.println( user1.getName() +" adlý kullanýcý kayýt oldu.");
		}else {
			System.out.println("Kullanýcý kayýt olamadý.");
		}
		

}


}
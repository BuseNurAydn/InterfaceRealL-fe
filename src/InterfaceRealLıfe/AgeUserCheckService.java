package InterfaceRealLıfe;

public class AgeUserCheckService implements IUserCheckService {

	@Override
	public boolean checkService(User user) {
		if(user.getAge() >= 18) {
			return true;
		}
		return false;
	}
	//METOD
	/*
	public boolean checkUser(User user) {
		if(user.getAge() >= 18) {
			return true;
		}else {
			return false;
		}
	}*/
	
	

}

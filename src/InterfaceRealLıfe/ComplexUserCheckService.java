package InterfaceRealLıfe;

public class ComplexUserCheckService implements IUserCheckService{

	@Override
	public boolean checkService(User user) {
		if(user.getAge() >= 18 && user.getName().startsWith("Bu")) {
			return true;
		}
		return false;
	}
	
	
	/*
	public boolean checkUser(User user) {
		if(user.getAge() >= 18) {
			return true;
		}else {
			return false;
		}
	}*/
}

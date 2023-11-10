package InterfaceRealLýfe;

public class Main {

	public static void main(String[] args) {     // new Complex...
		SignUpManager manager = new SignUpManager(new AgeUserCheckService());
        manager.signUp(new User(2,"Buse",25));

}
}
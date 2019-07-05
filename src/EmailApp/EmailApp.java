package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("John", "Bush");
		em1.setAlternateEmail("js@gmail.com");
		System.out.println("Alternamte email: " + em1.getAlternateEmail());
	}

}

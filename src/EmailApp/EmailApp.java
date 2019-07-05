package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("John", "Bush");
		
		System.out.println(em1.showInfo());
	
		/*em1.setAlternateEmail("js@gmail.com");
		System.out.println("Alternamte email: " + em1.getAlternateEmail());*/
	}

}

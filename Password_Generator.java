import java.util.Random;

class Password_Generator{
	public static void main(String[] args) {
		int length = 10;
		System.out.println(generatePwd(length));
	}
	static char[] generatePwd(int len){
		System.out.println("Your Password:");

		String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String chars = "abcdefghijklmnopqrstvwxyz";
		String numbers = "0123456789";
		String sybmols = "!@#$%^&*_:";

		String pass = charsCaps + chars + numbers + sybmols;
		Random rnd = new Random();

		char[] password = new char[len];
		int index = 0;
		for (int i =0; i < len; i++ ) {
			password[i] = pass.charAt(rnd.nextInt(pass.length()));
		}
		return password;
	}
}
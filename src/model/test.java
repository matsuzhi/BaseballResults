package model;

public class test {

	public static void maintest(){
		String str = SafePassword.getStretchedPassword("AshnYuk2", "matsuzhi");
		System.out.print(str);
	}
}

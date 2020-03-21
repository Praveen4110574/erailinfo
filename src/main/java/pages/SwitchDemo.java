package pages;

public class SwitchDemo {

	public static void main(String[] args) {
		int a = 10, b = 20;
		String operation = "add";
		//String[] operations = { "add", "sub" };
		switch (operation) {
		case "add":
			System.out.println(a + b);
			break;
		default:
			System.out.println("Invalid operation");
			break;

		}
	}

}

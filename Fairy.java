import java.util.*;
class Fairy{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your vacation!");
		System.out.println("1- Bali, 2- Santorini, 3- Marrakesh");
		int vacayChoice = input.nextInt();
		switch(vacayChoice) {
			case 1:
				Bali();
				break;
			case 2:
				Santorini();
				break;
			case 3:
				Marrakesh();
				break;
			default:
				System.out.print("Well, enjoy your trip!");
		}
	}
	public static void Bali() {
		System.out.print("*");
		System.out.print("\uD83D\uDC20");
	}
	public static void Santorini() {
		System.out.print("\uD83D\uDEE5");
	}
	public static void Marrakesh(){
		System.out.print("\uD83C\uDF34");
	}
}
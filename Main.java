package Formula;

public class Main {
	public static void main(String[] args) {
		Formula formula = Formula.create(args[0]);

		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);

		int result = formula.num(x, y);
		System.out.println(result);
	}
}
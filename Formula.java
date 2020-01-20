package Formula;

interface Formula {
	public int num(int x, int y);

	public static Formula create(String op) {
		switch (op) {
		case "tr":
			return new Triangle();
		case "sq":
			return new Square();
		}
		return null;
	}
}

class Triangle implements Formula {
	public int num(int x, int y) {
		return (x * y) / 2;
	}
}

class Square implements Formula {
	public int num(int x, int y) {
		return x * y;
	}
}
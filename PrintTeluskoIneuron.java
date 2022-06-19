

/**
 * @author Mithun 
 * @apiNote This Class prints 'INEURON' and 'TELUSKO' in the console
 *
 */
public class PrintTeluskoIneuron {

	public static void main(String[] args) {
		System.out.println("TELUSKO");
		printTelusko();
		System.out.println("INEURON");
		System.out.println();
		printIneuron();
	}

	/**
	 * Prints TELUSKO to the console
	 */
	private static void printTelusko() {
		printT();
		printE();
		printL();
		printU();
		printS();
		printK();
		printO();
	}

	/**
	 * The Method prints 'INEURON' to the console
	 */
	private static void printIneuron() {
		printI();
		printN();
		printE();
		printU();
		printR();
		printO();
		printN();
	}

	/**
	 * The method printI prints 'I' to the console
	 */
	public static void printI() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 || i == 6 || j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printN prints 'N' to the console
	 */
	public static void printN() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (j == 6 || j == 0 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printE prints 'E' to the console
	 */
	public static void printE() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 || i == 3 || i == 6 || j == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printU prints 'U' to the console
	 */
	public static void printU() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i != 6 && j != 6 && j != 0 || (i == 6 && j == 0) || (i == 6 && j == 6)) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printR prints 'R' to the console
	 */
	public static void printR() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (j == 0)
					System.out.print("* ");
				else {
					if (i == 0)
						System.out.print((j == 1 || j == 2 || j == 3 || j == 4 || j == 5) ? "* " : "  ");
					if (i == 1)
						System.out.print((j == 6) ? "* " : "  ");
					if (i == 2)
						System.out.print((j == 6) ? "* " : "  ");
					if (i == 3)
						System.out.print((j == 1 || j == 2 || j == 3 || j == 4 || j == 5) ? "* " : "  ");
					if (i == 4)
						System.out.print((j == 4) ? "* " : "  ");
					if (i == 5)
						System.out.print((j == 5) ? "* " : "  ");
					if (i == 6)
						System.out.print((j == 6) ? "* " : "  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printO prints 'O' to the console
	 */
	public static void printO() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {

				if (i == 0)
					System.out.print((j == 2 || j == 3 || j == 4) ? "* " : "  ");
				if (i == 1)
					System.out.print((j == 1 || j == 5) ? "* " : "  ");
				if (i == 2)
					System.out.print((j == 0 || j == 6) ? "* " : "  ");
				if (i == 3)
					System.out.print((j == 0 || j == 6) ? "* " : "  ");
				if (i == 4)
					System.out.print((j == 0 || j == 6) ? "* " : "  ");
				if (i == 5)
					System.out.print((j == 1 || j == 5) ? "* " : "  ");
				if (i == 6)
					System.out.print((j == 2 || j == 3 || j == 4) ? "* " : "  ");

			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printI prints 'T' to the console
	 */
	public static void printT() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 || j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printL prints 'L' to the console
	 */
	public static void printL() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 6 || j == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printS prints 'S' to the console
	 */
	public static void printS() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0)
					System.out.print((j != 0) ? "* " : "  ");
				if (i == 1)
					System.out.print((j == 0) ? "* " : "  ");
				if (i == 2)
					System.out.print((j == 0) ? "* " : "  ");
				if (i == 3)
					System.out.print((j != 0 && j != 6) ? "* " : "  ");
				if (i == 4)
					System.out.print((j == 6) ? "* " : "  ");
				if (i == 5)
					System.out.print((j == 6) ? "* " : "  ");
				if (i == 6)
					System.out.print((j != 6) ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * The method printK prints 'K' to the console
	 */
	public static void printK() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {

				if (i == 0)
					System.out.print((j == 0 || j == 4) ? "* " : "  ");
				if (i == 1)
					System.out.print((j == 0 || j == 3) ? "* " : "  ");
				if (i == 2)
					System.out.print((j == 0 || j == 2) ? "* " : "  ");
				if (i == 3)
					System.out.print((j == 0 || j == 1) ? "* " : "  ");
				if (i == 4)
					System.out.print((j == 0 || j == 2) ? "* " : "  ");
				if (i == 5)
					System.out.print((j == 0 || j == 3) ? "* " : "  ");
				if (i == 6)
					System.out.print((j == 0 || j == 4) ? "* " : "  ");

			}
			System.out.println();
		}
		System.out.println();
	}

}

package triangle_creation;

import java.util.*;

public class Triangle {

	private int sideA, sideB, sideC;

	public Triangle() {
		this.sideA = createSide();
		this.sideB = createSide();
		this.sideC = createSide();
	}

	private int createSide() {
		Random random = new Random();
		int side;

		side = random.nextInt(20) + 1;

		return side;
	}

	public void checkSide() {
		int store = 0, sum = 0;

		while (true) {

			if (this.sideA <= this.sideB)
				store = this.sideB;
			else if (this.sideA > this.sideB)
				store = this.sideA;

			if (store > this.sideC)
				store = this.sideC;
			else
				;

			if (store == this.sideA)
				sum = this.sideB + this.sideC;
			else if (store == this.sideB)
				sum = this.sideA + this.sideC;
			else if (store == this.sideC)
				sum = this.sideA + this.sideB;

			if (sum > store)
				break;
			else
				new Triangle();
		}
	}

	public int getSideA() {
		return this.sideA;
	}

	public int getSideB() {
		return this.sideB;
	}

	public int getSideC() {
		return this.sideC;
	}

	public int getTotalSides() {
		return this.sideA + this.sideB + this.sideC;
	}

	public String toString() {
		return "A=" + getSideA() + ", B=" + getSideB() + ", C=" + getSideC() + "\n" + "둘레길이: " + getTotalSides();
	}

	public void drawTriangle() {
		System.out.println("Draw(" + this.sideA + ", " + this.sideB + ", " + this.sideC + ")");
	}

	public void createTriangle() {
		checkSide();
		drawTriangle();
		System.out.println(toString());
	}
}

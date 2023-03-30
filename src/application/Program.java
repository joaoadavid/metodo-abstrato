package application;

import java.util.Scanner;

import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Shape #" + i + "data: ");
			System.out.print("Rectangle or Circle (r/c): ");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());// declara o enum e chama a plavra do enum
			if (ch == 'r'|| ch == 'R') {
				System.out.print("Widhth: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));// instancia a lista se for retangulo
			} else if (ch== 'c' || ch == 'C') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));// instacia a lista se for um circulo
			}

		}

		System.out.println();
		System.out.println("Shapes Areas: ");

		for (Shape shape : list) {
			System.out.print(String.format("%.2f%n", shape.area()));
		}
	}
}

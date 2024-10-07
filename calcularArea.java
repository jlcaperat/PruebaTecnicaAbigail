package prueba;

import java.util.Scanner;

public class calcularArea {
	
	
	   public  double calcularAreaTriangulo(double base, double altura) {
	        return (base * altura) / 2;
	    }
	   
	   public  double calcularAreaCirculo(double radio) {
	        return Math.PI * Math.pow(radio, 2);
	    }

	public static void main(String[] args) {
		
		double baseTriangulo =10;
		double alturaTriangulo =50;
		double resultadoTriangulo;
		
		calcularArea areasTriangulo= new calcularArea();
		resultadoTriangulo= areasTriangulo.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
		System.out.println("El area es "+ resultadoTriangulo);
		
		  double radio = 5.0;
	        double area = areasTriangulo.calcularAreaCirculo(radio);
	        System.out.println("El área del círculo es: " + area);

	}

}

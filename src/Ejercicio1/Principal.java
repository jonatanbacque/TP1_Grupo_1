package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		// 8. Crear una clase llamada principal y dentro de �sta crear el main:
		// En el main se deber�n crear 5 empleados y mostrar su informaci�n
		// correspondiente utilizando el m�todo toString().
		
		System.out.println("-------------------------------------------");
		System.out.println("Constructor sin Parametros");
		Empleado emp = new Empleado();
		Empleado emp1 = new Empleado();
		System.out.println("toString");
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println("Constructor con Parametros");
		Empleado emp2 = new Empleado("Aldo", 55);
		Empleado emp3 = new Empleado("Esteban", 32);
		Empleado emp4 = new Empleado("Quito", 44);
		System.out.println("toString");
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println("-------------------------------------------");
		System.out.println("M�todo est�tico que devuelva el pr�ximo ID a ser generado");
		System.out.println("El pr�ximo ID ser� el " + Empleado.DevuelveElProximoID());
	}

}

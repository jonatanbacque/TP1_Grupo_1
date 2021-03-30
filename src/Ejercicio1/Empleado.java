package Ejercicio1;

//1. Todas las clases pertenecientes a este ejercicio se crear�n dentro del paquete llamado Ejercicio1

//2. Crear una clase Empleado con las siguientes propiedades: int id; String nombre; int edad

public class Empleado {
//3. Aplicar el concepto de encapsulaci�n dentro de la clase Empleado
	private int id;
	private String nombre;
	private int edad;

//4. El Id del Empleado debe ser generado autom�ticamente a partir de la clase,
//	el primer ID ser� el n�mero 1000 e ir� incrementando en 1 por cada nuevo
//	empleado agregado. El ID del empleado deber� ser generado en el
//	constructor de la clase. Una vez que se le asigne un ID del Empleado, este no
//	podr� ser modificado, por lo que el ID debe ser una variable constante (usar
//	final para crear la constante)	

	private static int cont = 1000;

//	5. La clase tendr� dos constructores.
//	El primer constructor ser� vac�o y cargar� por defecto en la variable nombre: �sin nombre� y en la variable edad: �99�.
//	El segundo constructor recibir� como par�metros: el nombre y la edad, para ser asignados.

	public Empleado() {
		cont++;
		this.id = cont;
		this.nombre = "Sin Nombre";
		this.edad = 99;
	}

	public Empleado(String nombre, int edad) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}

// 6. Crear un m�todo est�tico que devuelva el pr�ximo ID a ser generado: �int devuelveProximoID()�.

	public static int DevuelveElProximoID() {
		return cont + 1;
	}

//getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

// 7. Realizar el m�todo toString() dentro de la clase Empleado.
	@Override
	public String toString() {
		return "Id Empleado=" + id + ", Nombre=" + nombre + ", Edad=" + edad;
	}
}
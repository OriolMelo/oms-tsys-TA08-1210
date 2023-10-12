package main;

public class Persona {

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = DNI;
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = DNI;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	final private char SEXO = 'H';
	final private String DNI = "000000000A";
}

package main;

public class Electrodomestico {
	
	protected double precio_base;
	protected String color;
	protected char consumo_energetico;
	protected double peso;
	
	private String colores[] =  new String[]{"blanco", "negro", "rojo", "azul", "gris"};

	
	private final double PRECIO_BASE = 100;
	private final String COLOR_BASE = "blanco";
	private final char CONSUMO_BASE = 'F';
	private final double PESO_BASE = 5;
	
	public Electrodomestico() {
		this.precio_base = PRECIO_BASE;
		this.color = COLOR_BASE;
		this.consumo_energetico = CONSUMO_BASE;
		this.peso = PESO_BASE;
	}

	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.color = COLOR_BASE;
		this.consumo_energetico = CONSUMO_BASE;
		this.peso = peso;
	}

	public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}

}

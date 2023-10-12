package main;

public class Serie {

	public Serie() {
		this.titulo = "";
		this.num_temporadas = NUM_TEMP_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.num_temporadas = NUM_TEMP_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = creador;
	}
	
	public Serie(String titulo, int num_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.num_temporadas = num_temporadas;
		this.entregado = ENTREGADO_BASE;
		this.genero = genero;
		this.creador = creador;
	}
	
	private String titulo;
	private int num_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	private final int NUM_TEMP_BASE = 3;
	private final boolean ENTREGADO_BASE = false;
}

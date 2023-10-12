package main;

public class Password {

	public Password() {
		this.longitud = LONG;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña();
	}

	private String generarContraseña() {
		String contra = "";
		for(int i=0; i<longitud; i++) {
			contra=contra.concat(String.valueOf(caracteres.charAt(generarAleatorio(0,caracteres.length()-1))));
		}
		return contra;
	}

	private int generarAleatorio(int min, int max) {
		return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}

	private int longitud;
	private String contraseña;
	private String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	private final int LONG = 8;
}

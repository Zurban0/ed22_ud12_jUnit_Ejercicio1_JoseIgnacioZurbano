package ed22_ud12_jUnit_Ejercicio1_JoseIgnacioZurbano;
public class Cadena {
	public int longitud(String cadena) {
		return cadena.length();
	}
	public int vocales(String cadena) {
		int numCaracteres = 0;
		String vocal = "aeiou";
		for (int i = 0; i < cadena.length(); i++) {
			for (int o = 0; o < vocal.length(); o++) {
				if (cadena.charAt(i) == vocal.charAt(o)) {
					numCaracteres = numCaracteres + 1;
				}
			}
		}
		return numCaracteres;
	}
	public String invertir(String cadena) {
		String cadenaInvertida = "";
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + String.valueOf(cadena.charAt(i));
		}
		return cadenaInvertida;
	}
	public int contarLetra(String cadena, char caracter) {
		int numVeces = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (caracter == cadena.charAt(i)) {
				numVeces = numVeces + 1;
			}
		}
		return numVeces;
	}
}

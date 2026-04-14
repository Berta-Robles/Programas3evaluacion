package Programas;
	
	
public class jugador extends Persona{
	String posicion;
	int numero;
	public jugador(String NuevoDni, String NuevoNombre, String NuevoApellido1, String NuevoApellido2, String posicion) {
		super(NuevoDni, NuevoNombre, NuevoApellido1, NuevoApellido2);
		this.posicion=posicion;
		// TODO Auto-generated constructor stub
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNuemeroNombre() {
		return (numero+" "+Nombre+" "+Apellido2);
	}
	
	
}

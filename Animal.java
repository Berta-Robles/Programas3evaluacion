package Programas;

public class Animal extends Producto{
	private String TipoAnimal;
	private Fecha fechaNacimientoAnimal;
	
	public Animal(int idProducto, String descripcion,Fecha fechaNacimientoAnimal) {
		super(idProducto,descripcion);
		this.fechaNacimientoAnimal=fechaNacimientoAnimal;
	}

	public String getTipoAnimal() {
		return TipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}

	public Fecha getFechaNacimientoAnimal() {
		return fechaNacimientoAnimal;
	}

	public void setFechaNacimientoAnimal(Fecha fechaNacimientoAnimal) {
		this.fechaNacimientoAnimal = fechaNacimientoAnimal;
	}
	

}

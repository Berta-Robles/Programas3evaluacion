package Programas;

public class Producto {
	//Atributos
	private int idProducto ;
	private String Descripcion;
	private double precio;
	public Producto(int idProducto, String descripcion) {
		this.idProducto = idProducto;
		Descripcion = descripcion;
	}
	public Producto(int idProducto) {
		super();
		this.idProducto = idProducto;
	}
//	el constructor esta sobrecargado
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
//	metodo q devuelve
	public String getIdProductoDescripcionPrecio() {
		String LineaProducto="";
		LineaProducto=idProducto+" "+Descripcion+" "+precio;
		return(LineaProducto);
	}
	public String getIdProductoDescripcionPrecio(int iva) {
		String LineaProducto="";
		LineaProducto=idProducto+" "+Descripcion+" "+(precio+(precio*iva)/100);
		return(LineaProducto);
	}
}

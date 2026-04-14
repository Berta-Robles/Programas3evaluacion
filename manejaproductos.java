package Programas;

public class manejaproductos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto_1;
		producto_1=new Producto(1,"Pienso para perros");
		producto_1.setPrecio(6.25);
		System.out.println(producto_1.getIdProductoDescripcionPrecio());
		System.out.println(producto_1.getIdProductoDescripcionPrecio(21));
		System.out.println();
	}
}

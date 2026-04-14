package Programas;

public class Manejapuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto miPuntito;
		miPuntito=new Punto(4,3);
		System.out.println("coordenada x="+miPuntito.getcoordX());
		System.out.println("coordenada y="+miPuntito.getcoordY());
		System.out.println(miPuntito.getCoordsFormatoTexto()); 

	}

}

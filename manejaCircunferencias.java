package Programas;

public class manejaCircunferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circunferencia miCirculito;
		Punto miCentrito;
		miCentrito=new Punto (3,8);
		float radio=(float) 10;
		miCirculito=new Circunferencia(miCentrito,radio);
		System.out.println("AREA="+miCirculito.getArea());
		miCirculito.getRadio();
		
	}
}

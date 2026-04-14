package Programas;

public class Circunferencia {
//	atributos locativos argumentales
	Punto Centro;
	float radio;
//	Bob el constructor
	public Circunferencia(Punto Centro, Float radio){
		this.Centro=new Punto(Centro.getcoordX(),Centro.getcoordY());
		this.radio=radio;
	}
//	Metodos
	Punto getCentro() {
		return(Centro);
	}
	float getRadio(){
		
		return(radio);
	}
	void setRadio (float radio) {
		this.radio=radio;
	}
	void setCentro(Punto Centro) {
		this.Centro=Centro;
//		this.Centro=new Punto(Centro.getCoordX(),Centro.getCoord());
	}
	public double getArea() {
		double area;
		area=Math.PI*radio*radio;
		return (area);
	}
	
}

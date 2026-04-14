package Programas;
public class Punto {
	float coordX;
	float coordY;
	public Punto(float coordX, float coordY){
		this.coordX=coordX;
		this.coordY=coordY;
	}
	
	float getcoordX(){
		return(coordX);
	}
	
	float getcoordY() {
		return(coordY);
	}
	
	void setCoordX(float coordX) {
		this.coordX=coordX;
	}
	
	void setCoordY(float coordY) {
		this.coordY=coordY;
	}
	
	String getCoordsFormatoTexto() {
		String texto="";
		texto=texto+"Las coordenadas del punto son ("+coordX+","+coordY+")";
		return(texto);	
	}
}
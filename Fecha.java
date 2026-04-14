package Programas;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	public String getDiaMesAño() {
		String CadenaFecha="";
		CadenaFecha=dia+"/"+mes+"/"+año;
		return(CadenaFecha);
	}
	public String getDiaMesAño(String tipoFormato) {
		String CadenaFecha="";
		String nombreMes[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		CadenaFecha=dia+"de"+nombreMes[mes-1]+"del"+año;
		return(CadenaFecha);
	}

}

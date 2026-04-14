package Programas;

public class Persona {
	//	atributos
	String Dni;
	String Nombre;
	String Apellido1;
	String Apellido2;
	int edad;
	float altura;
	char genero;
//	constructor
	public Persona(String NuevoDni,String NuevoNombre, String NuevoApellido1, String NuevoApellido2) {
		Dni=NuevoDni;
		Nombre=NuevoNombre;
		Apellido1=NuevoApellido1;
		Apellido2=NuevoApellido2;			
	}
//	Métodos
	void MuestraNombrePantalla(){
		System.out.println(Nombre);
	}
	String DevuelveInicialDelNombre(){
		String Inicial;
		Inicial = Nombre.substring(0, 1);
		return Inicial;	
	}
	String DevuelveNombreYLosApellidos() {
		String NombreYApellidos;
		NombreYApellidos = Nombre+" "+ Apellido1+ " " + Apellido2;
		return NombreYApellidos;	
	}
	String Contrasena() {
		String Cont;
		Cont= Nombre.substring(0,3);
		Cont= Cont + Apellido1.substring(0,3);
		Cont= Cont + Apellido2.substring(0,3);
		Cont= Cont + Dni.substring(0,2);
		return Cont;	
	}
}

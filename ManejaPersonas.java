package Programas;

public class ManejaPersonas {

	public static void main(String[] args) {
		Persona persona1;
		persona1=new Persona("77219366V","Gabriel","Gascón","Garcia");
		System.out.println(persona1.DevuelveNombreYLosApellidos());
		System.out.println(persona1.DevuelveInicialDelNombre());
		System.out.println(persona1.Contrasena());
		
		jugador jugador1;
		jugador1=new jugador ("no tiene, tiene NIE es morico","yamin","tamal","morez","extremo derecha");
		jugador1.setNumero(10);
		jugador1.getNuemeroNombre();
		System.out.println(jugador1.getNuemeroNombre());
		
	}
}

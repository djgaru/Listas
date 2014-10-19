
public class Main {

	public static void main(String[] args) {
		ListaEnlazada lista=new ListaEnlazada();
		System.out.println("Lista vacia: " + lista.estaVacia());
		lista.addPrimero("Agregar Edgar");
		lista.addPrimero("Agregar Alfonso");
		lista.addPrimero("......");
		lista.addPrimero(4);
		
		System.out.println("Primer elemento: " +lista.obtener(0));
		System.out.println("Ultimo elemento: " +lista.obtener(lista.size()-1));
		System.out.println("Segundo elemento: " +lista.obtener(2));
		
		System.out.println("Esta vacia: " + lista.estaVacia());
		System.out.println("Tamaño: " +lista.size());
	
	}

}

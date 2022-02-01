package main;

import automotora.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxiUno = new Taxi("azul", "AABB11", 1000);
		taxiUno.pagarPasaje(1500);
		MiniBus miniBusUno = new MiniBus("rojo", "CCDD22", 16, "Inter Urbano");
		miniBusUno.imprimeBus();
		System.out.println("Asientos disponibles: " + miniBusUno.asientosDisponibles(8));
		Vendedor vendedorUno = new Vendedor("111111-2", "Pablo", "direccion 123");
		
		Tienda tiendaUno = new Tienda(vendedorUno, miniBusUno, 44);
		System.out.println(tiendaUno.existeStock());
		
		

 }
}
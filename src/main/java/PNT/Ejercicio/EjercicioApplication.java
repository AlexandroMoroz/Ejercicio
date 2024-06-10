// Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina
// la ejecución:

// Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20

// Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18

// Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

// Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo

// =============================

// Producto más caro: Frutillas

// Producto más barato: Coca-Cola


// La solución debe cumplir con los siguientes requisitos:

// Diseñar una solución orientada a objetos. ✓
// La salida es por consola y exactamente como se requiere. ✓
// Usar solamente las clases provistas por Java 8. ✓
// Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo. ✓
// El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos. ✓
// Para mostrar el mayor / menor, utilizar la interfaz Comparable. ✓
// Para imprimir por pantalla, sobrescribir el método toString() ✓

package PNT.Ejercicio;

// Se importan todos los paquetes necesarios.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import PNT.Ejercicio.entity.Drink;
import PNT.Ejercicio.entity.Fruit;
import PNT.Ejercicio.entity.HygieneProduct;
import PNT.Ejercicio.entity.Product;

@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioApplication.class, args);

		// Se crea la lista de productos.

        List<Product> products = new ArrayList<>();
		
		// Se crean y agregan cada uno de los productos a la lista.

        products.add(new Drink("Coca-Cola Zero", 20, 1.5));
		products.add(new Drink("Coca-Cola", 18, 1.5));
		products.add(new HygieneProduct("Shampoo Sedal", 19, "500ml"));
		products.add(new Fruit("Frutillas", 64, "kilo"));

        // Agrego un Print para mejorar la legibilidad de la consola.

		
		System.out.println("\n=============================");
		// Se crea un iterador forEach que itera la lista de productos e imprime por pantalla sus respectivos ToString.

		for (Product product : products) {
			System.out.println(product);
		}
	
		System.out.println("=============================");

		// Se crean dos objetos de tipo Product para encontrar el producto más caro y el más barato.

        Product expensive = Collections.max(products);
        Product cheap = Collections.min(products);

		// Se imprime por pantalla el nombre del producto más caro y el más barato.

        System.out.println("Producto más caro: " + expensive.getName());
        System.out.println("Producto más barato: " + cheap.getName());

		// Agrego otro Print para mejorar la legibilidad de la consola.

		System.out.println("=============================\n");
	}

}

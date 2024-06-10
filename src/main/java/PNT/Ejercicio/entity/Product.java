package PNT.Ejercicio.entity;

// Se importan los paquetes de Lombok para el uso de @Getter, @Setter y @AllArgsConstructor

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Se crea la clase padre Product que implementa la interfaz "Comparable"
@Getter
@Setter
@AllArgsConstructor
public class Product implements Comparable<Product>{
    
    protected String name;
    protected double price;

    // Se implementa el método compareTo para encontrar el producto más caro y el más barato.
    @Override
    public int compareTo(Product p) {
        return Double.compare(this.price, p.getPrice());
    }

}

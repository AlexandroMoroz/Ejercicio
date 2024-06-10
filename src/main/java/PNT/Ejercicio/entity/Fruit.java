package PNT.Ejercicio.entity;

// Se importan los paquetes de Lombok para el uso de @Getter y @Setter

import lombok.Getter;
import lombok.Setter;

// Se crea la clase hija Fruit que hereda de la clase padre Product y se declara como final para evitar la herencia.

@Getter
@Setter
public final class Fruit extends Product{
    
private String saleUnit;

public Fruit(String name, double price, String saleUnit){
    super(name, price);
    this.saleUnit = saleUnit;
}

 @Override
    public String toString() {
        return "Nombre: " + name + " /// Precio: $" + Math.round(price) + " /// Unidad de venta: " + saleUnit;
    }
    
}

package PNT.Ejercicio.entity;

// Se importan los paquetes de Lombok para el uso de @Getter y @Setter

import lombok.Getter;
import lombok.Setter;

// Se crea la clase hija Drink que hereda de la clase padre Product y se declara como final para evitar la herencia.

@Setter
@Getter
public final class Drink extends Product{
    
    private double liters;
    
    public Drink(String name, double price, double liters){
        super(name, price);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " /// Litros: " + liters + " /// Precio: $" + Math.round(price);
    }

}

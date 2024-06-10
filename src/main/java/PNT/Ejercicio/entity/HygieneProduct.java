package PNT.Ejercicio.entity;

// Se importan los paquetes de Lombok para el uso de @Getter y @Setter

import lombok.Getter;
import lombok.Setter;

// Se crea la clase hija HygieneProduct que hereda de la clase padre Product y se declara como final para evitar la herencia.

@Getter
@Setter
public final class HygieneProduct extends Product{
 
    private String content;

    public HygieneProduct(String name, double price, String content){
        super(name, price);
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " /// Contenido: " + content + " /// Precio: $" + Math.round(price);
    }

}

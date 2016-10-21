package patroncomposite;

import patroncomposite.composite.CPU;
import patroncomposite.composite.Computer;
import patroncomposite.composite.GraphCard;
import patroncomposite.composite.Keyboard;
import patroncomposite.composite.Memory;
import patroncomposite.composite.Monitor;

public class PatronComposite {

    public static void main(String[] args) {
        //Creamos la configuración de una computadora
        Computer computer = new Computer();
        computer.agregarHijo(new CPU(200));
        computer.agregarHijo(new Keyboard(50));
        computer.agregarHijo(new Memory(30));
        computer.agregarHijo(new Monitor(100));
        
        GraphCard graphCard = new GraphCard();
        graphCard.agregarHijo(new CPU(24));
        graphCard.agregarHijo(new Memory(50));
        
        computer.agregarHijo(graphCard);
        
        System.out.println("Precio Computadora : " + computer.obtenerPrecio());
    }
    
}

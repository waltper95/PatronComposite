package patroncomposite.composite;
public class CPU extends Componente{
    
    public CPU(int precio) {
        this.precio = precio;
    }
    
    
    
    @Override
    public int obtenerPrecio() {
        return precio;
    }
    
    
    
    
}

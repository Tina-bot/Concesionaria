
package domain;


public class Motos extends Autos implements Comparable <Autos> {
  
     private final int Cilindrada;

    public Motos(String marca, String modelo, int puertas, double precio,int cilindrada) {
        super(marca, modelo, puertas, precio);
        this.Cilindrada = cilindrada;
    }



 

    public int getCilindrada() {
        return Cilindrada;
    }
    
    

    @Override
    public String toString() {
        return "Marca:" + this.getMarca() + "// Modelo: " + this.getModelo() + "//Cilindrada: "+ this.getCilindrada()+ "cc. // Precio: $" + this.getPrecio(); 
    }

    public int compareTo (Motos x){
        if (super.getPrecio() < x.getPrecio()){
            return -1;
        } if(super.getPrecio() <x.getPrecio()){
            return 1;}
        
         return 0;
    }


  

    
   
}

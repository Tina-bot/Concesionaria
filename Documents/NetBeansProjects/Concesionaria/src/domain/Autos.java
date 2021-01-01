
package domain;


public class Autos implements Comparable <Autos> {
   private final String Marca;
   private final String Modelo;
   private final int Puertas;
   private final double Precio;
   
    public Autos (String marca, String modelo, int puertas, double precio){
    this.Marca= marca;
    this.Modelo= modelo;
    this.Puertas= puertas;
    this.Precio= precio;
    
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getPuertas() {
        return Puertas;
    }

    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return "Marca:" + Marca + "// Modelo: " + Modelo + "// Puertas:" + Puertas + " // Precio: $ " + Precio ;
    }
    
   @Override
    public int compareTo (Autos x){
        if( Precio > x.Precio ){
            return -1; }
        if ( Precio < x.Precio){
            return 1;}
               
       return 0;
    
    
    }
        static void Imprimir (Autos [] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println((i+1)+"."+"Marca:" + array[i].Marca + "// Modelo: " + array[i].Modelo + "// Puertas:" + array[i].Puertas + " // Precio: $ " + array[i].Precio );
                
            }
        }
    
  


}
        
    
    
    
    


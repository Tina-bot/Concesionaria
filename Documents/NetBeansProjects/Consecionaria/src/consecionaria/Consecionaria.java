package consecionaria;

import domain.Autos;
import domain.Motos;
import java.util.Arrays;

public class Consecionaria {

    public static void main(String[] args) {
        Autos auto1[] = new Autos[4];

        auto1[0] = new Autos("Peugeot", "206", 4, 200000);
        auto1[1] = new Motos("Honda", "Titan", 0, 60000, 125);
        auto1[2] = new Autos("Peugeot", "208", 5, 250000);
        auto1[3] = new Motos("Yamaha", "YBR", 0, 80500.50, 160);
        imprimeArray(auto1);
        System.out.println("=============================");
        menormayor(auto1, 0, "", "");
        contiene(auto1,"","",(double)0);
        System.out.println("=============================");
        Arrays.sort(auto1);
        for (Autos auto11 : auto1) {
            System.out.println(auto11.getMarca() + " " + auto11.getModelo());
        }
      
        

    }

    static void imprimeArray(Autos[] array) {
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + ". " + array[i]);

        }

    }

    static void menormayor(Autos[] array, double x, String d, String e) {
        for (int i = 0; i < 4; i++) {
            if (x < array[i].getPrecio()) {
                x = array[i].getPrecio();
                d = array[i].getMarca();
                e = array[i].getModelo();
                
            }
        }
        System.out.println("Vehículo más caro: " + d + " " + e);

    
           for (int i = 0; i < 4; i++) {
            if (x > array[i].getPrecio()) {
                x = array[i].getPrecio();
                d = array[i].getMarca();
                e = array[i].getModelo();
                
            }
        }
        System.out.println("Vehículo más barato: " + d + " " + e);
}

        static void contiene (Autos[] array, String x, String m,Double p){
                for (int i = 0; i < 4; i++) {
                if (array[i].getModelo().contains("Y")){
                    x=array[i].getMarca();
                    m= array[i].getModelo();
                    p= array[i].getPrecio();
                    
                }
            }
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’ : "+m+" "+ x+" "+p);
        }
  
     

        }

 


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad : ");
    

        try {
        
   
    int edad = teclado.nextInt();
    
    

    if (edad >= 4 && edad <= 6) {
        System.out.println("Lunes y Miercoles de 16 a 17");
    } else {
        if(edad >= 7 && edad <= 8) {
            System.out.println("Martes y Jueves de 16:30 a 17:30");
        } else {
            if (edad >= 9 && edad <= 10) {
                System.out.println("Martes y Jueves de 17:30 a 19");
            } else {
                if (edad >= 11 && edad <= 13) {
                    System.out.println("Lunes y Miercoles de 17 a 18:30");
                } else {
                    System.out.println("Ingrese un numero valido.");
                }
              } 
            }
        }   

            } catch (Exception e) {
            System.out.println("Coloca un Numero.");
            } finally {
                teclado.close();
        }
    }        
}
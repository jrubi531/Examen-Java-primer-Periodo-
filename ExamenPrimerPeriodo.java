import java.util.Scanner;

public class ExamenPrimerPeriodo {
    public static void main(String[] args) {
        Scanner entradaNum = new Scanner(System.in);
        
        // Primer problema 
        System.out.print("Ingrese un número: ");
        double num1 = entradaNum.nextDouble();
        double r1 = (num1+num1) * 3;
        System.out.println("El resultado de la operación x + 3x con " + num1 + " es: " + r1);
        
        // Segundo problema 
        System.out.print("Ingrese el otro numero: ");
        double num2 = entradaNum.nextDouble();
        double r2 = (num2 * num2) - 5;
        System.out.println("El resultado de la operación 2x - 5 con " + num2 + " es: " + r2);

        //tercer problrma 
        System.out.print("ingrese otro numero ");
        double num3 = entradaNum.nextDouble();
        double r3 = (2/num3)+(num3*num3);
        System.out.println("El resultado de 2/x + xa la 2 con " + num3 + " es " + r3);

        //cuarto problema 
        System.out.println("ingrese otro numero");
        double num4 = entradaNum.nextDouble();
        double r4 = (num4 + 2 * num4 ) * 3;
         
        // segunda serie 

                Scanner scanner = new Scanner(System.in);
                int opcion;
        
                do {
                    // Mostrar menú
                    System.out.println("\nMenu:");
                    System.out.println("1. Calcular promedio");
                    System.out.println("2. Saludar por tu nombre");
                    System.out.println("3. Di hola mundo");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opcion: ");
                    opcion = scanner.nextInt();
        
                    switch (opcion) {
                        case 1:
                        System.out.print("Cuantos numeros desea ingresar?: ");
                        int cantidad = scanner.nextInt();
                        double suma = 0;
    
                        for (int i = 0; i < cantidad; i++) {
                            System.out.print("Ingrese un numero: ");
                            double numero = scanner.nextDouble();
                            suma = numero;
                        }
    
                        double promedio = suma / cantidad;
                        System.out.println("El promedio es: " + promedio);
                            
                        
                            break;

                        case 2:
                            System.out.print("Ingrese su nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.println("Hola, " + nombre + "!");
                            break;
        
                        case 3:
                            System.out.println("Hola mundo");
                            break;
        
                        case 4:
                            System.out.println("Saliendo del programa...");
                            break;
        
                        default:
                            System.out.println("Opcion invalida. Intente de nuevo.");
                    }
                } while (opcion != 4);
        
                
            

        
        
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piiramidesu5;


import java.util.Scanner;

/**
 *
 * @author break
 */
public class PIiramidesU5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ññññBienvenidoññññ ");
        boolean banS = true;
        do {
            System.out.println("ññSelecciona una opcionññ");
            System.out.println(" 1. Piramide asterisco");
            System.out.println(" 2. Piramide Letras");
            System.out.println(" 3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
             switch(opcion){
                case 1:
                    System.out.println("1. Piramide asteriscos");
                    System.out.println("ñIngresa el numero de filas de la piramide de asteriscosñ");
                    int numF = scanner.nextInt();
                    for (int i = 1; i <= numF; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2. Piramide Letras");
                    System.out.println("ñIngresa el numero de filas de la piramide de letrasñ");
                    int numFilas = scanner.nextInt();
                    int valorNumero = 1;
                    char valorLetra = 'A';
                    for (int i = 1; i <= numFilas; i++) {
                        for (int j = 0; j < i; j++) {
                            if (i % 2 == 1) {
                                System.out.print(valorNumero++);
                            } else {
                                System.out.print(valorLetra++);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    banS = false;
                    System.out.println("ññSaliendoññ");
                    break;
                default:
                    System.out.println("ññññOpcion no validaññññ");
                    break;
            }
        }         
         while (banS);
         scanner.close();
    }
    
}

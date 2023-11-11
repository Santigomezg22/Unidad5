/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2.metodos;
import java.util.Scanner;
/**
 *
 * @author Sgshu
 */
public class Practica2Metodos {
    public static double suma( double num1,double num2) {
        return num1+num2;
    }
    public static double resta(double num1,double num2) {
        return num1-num2;
    }
    public static double multiplicacion(double num1,double num2) {
        return (num1)*(num2);
    }
    public static double division(double num1,double num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
          Scanner scanner= new Scanner (System.in);
    
         System.out.println("***Ingrese el primer numero***");
         double num1=scanner.nextDouble();
         System.out.println("***Ingrese el segundo numero***");
         double numero2=scanner.nextDouble();
         
        double totalSuma = suma(num1,numero2);
        System.out.println("La suma es: " + totalSuma);
        double  totalResta = resta(num1,numero2);
        System.out.println("La resta es: " + totalResta);
        double  totalMultiplicacion = multiplicacion(num1,numero2);
        System.out.println("La multiplicacion es: " + totalMultiplicacion);
        double  totalDivision = division(num1,numero2);       
        System.out.println("La division es: " + totalDivision);
    }
    
}

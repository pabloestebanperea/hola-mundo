/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author EMMA KARINA
 */
public class HolaMundo {
//Este es el método main
public static void main(String[] args) {
String nombre = "Mariano";
int numero = 10;
double decimales = 40.5;
boolean bandera = false;

System.out.println(nombre);
System.out.println(numero);
System.out.println(decimales);
System.out.println(bandera);

int num1 = 5;
int num2 = 5;
int suma = num1 + num2;
double division = num1 / num2;
boolean logico = num2 < num1;
num1++;
num1++;
num1++;
num1++;
num1++;

System.out.println(suma);
System.out.println(division);
System.out.println(logico);
System.out.println(num1);

int num = 10;
num++;
num++;
System.out.println("La variable tiene el valor de: " +num);
System.out.print("Hola");
System.out.print("Mundo");
}
/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num;
        System.out.println("Ingrese el tamaño del arreglo");
        num = entrada.nextInt();
        int[] arreglo = new int[num];
        int suma;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese el valor de la posicion %d\n",i);
            arreglo[i] = entrada.nextInt();
        }
        suma = misterio(arreglo,arreglo.length);
        System.out.printf("La suma es: %d\n",suma);
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
// Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
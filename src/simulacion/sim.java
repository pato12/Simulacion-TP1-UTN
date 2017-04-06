/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import generadores.*;
import java.util.*;

/**
 *
 * @author patricioperez
 */
public class sim {

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("---1.Punto A---");
            System.out.println("---2.Punto B---");
            System.out.println("---3.Punto C---");
            System.out.println("---4.SALIR---");
            System.out.println("----------------");
            System.out.println("Ingrese su opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    puntoA();
                    break;
                case 2:

                    //puntoB();
                    break;
                case 3:

                    //puntoC();
                    break;

                default:
                    System.exit(0);
            }
        } while (opcion != 4);

    }

    private static void puntoA() {
        System.out.println("----- Generadores de numeros aleatorios ----");
        System.out.println("Ingrese valor de semilla; ");
        Scanner sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        System.out.println("1.Ingresar valores u 2. obtener valores optimos: ");
        int opc = sc.nextInt();

        if (opc == 1) {
            System.out.println("Ingrese valor de a: ");
            int a = sc.nextInt();
            System.out.println("Ingrese valor de m: ");
            int m = sc.nextInt();
            System.out.println("Ingrese valor de c: ");
            int c = sc.nextInt();
            CongruenteLineal h = new CongruenteLineal(a, c, m, x0);
            for (int i = 0; i < 20; i++) {
                double ri = h.nextNumber();
                System.out.println("r" + (i + 1) + ": " + ri);
            }

            int i = 20;
            int f;
            do {
                System.out.println("Si desea continuar listando la serie ingrese 1, para salir 2?");
                f = sc.nextInt();
                double ri = h.nextNumber();

                if (f == 1) {
                    System.out.println("r" + (i + 1) + ": " + ri);
                    i++;
                }
            } while (f == 1);

        } else {
            CongruenteLineal h = new CongruenteLineal(x0);
            System.out.println("Ingrese valor de la constante k: ");
            int k = sc.nextInt();
            System.out.println("Ingrese valor de la constante g: ");
            int g = sc.nextInt();

            h.setOptimo(k, g);

            for (int i = 0; i < 20; i++) {
                double ri = h.nextNumber();
                System.out.println("r" + (i + 1) + ": " + ri);
            }

            int i = 20;
            int f;
            do {
                System.out.println("Si desea continuar listando la serie ingrese 1, para salir 2?");
                f = sc.nextInt();
                double ri = h.nextNumber();
                System.out.println("r" + (i + 1) + ": " + ri);
                i++;
            } while (f == 1);
        }

    }
}

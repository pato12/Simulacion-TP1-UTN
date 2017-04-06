/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

/**
 *
 * @author patricioperez
 */
public class CongruenteLineal implements Generador {

    private int a;
    private int c;
    private int m;
    private int xi;

    public CongruenteLineal(int x0) {
        this.xi = x0;
    }

    public CongruenteLineal(int a, int c, int m, int x0) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.xi = x0;
    }

    public void setOptimo(int k, int g) {
        this.a = 1 + 4 * k;
        this.m = (int) Math.pow(2, g);
        this.c = relativamentePrimo(this.m);
    }

    public double nextNumber() {
        this.xi = (this.a * this.xi + this.c) % this.m;
        return (double) this.xi / (m - 1);
    }

    private int relativamentePrimo(int m) {
        int c = m;

        do {
            int aux = mcd(c, m);

            if (aux == 1) {
                return c;
            }

            c--;
        } while (c < m);

        return c;
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
}

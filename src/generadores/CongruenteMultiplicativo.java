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
public class CongruenteMultiplicativo implements Generador {

    private int a;
    private int m;
    private int xi;
    
    public CongruenteMultiplicativo(int x0) {
        this.xi = x0;
    }

    public CongruenteMultiplicativo(int a, int m, int x0) {
        this.a = a;
        this.m = m;
        this.xi = x0;
    }

    public void setOptimo(int k, int g) {
        this.a = 3 + 8 * k;
        this.m = (int) Math.pow(2, g);
    }

    public double nextNumber() {
        this.xi = (this.a * this.xi) % this.m;
        return (double)this.xi / (m - 1);
    }
}

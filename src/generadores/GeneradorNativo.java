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
public class GeneradorNativo implements Generador {

    public double nextNumber() {
        return Math.random();
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examened5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

   
    public static void main(String[] args) {
        CuentaAhorro miCuenta;
        double saldoActual;
        miCuenta = new CuentaAhorro("Juan López","1000-2365-85-123456789",2500,0);
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {

            miCuenta.ingresar(-695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    
}

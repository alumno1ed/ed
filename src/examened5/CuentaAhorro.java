/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened5;

/**
 *
 * @author Loren
 */
public class CuentaAhorro {

    String nombre;
    String cuenta;
    double tipoInterés;
    private double saldo;


    public CuentaAhorro ()
    {
    }
 
    public CuentaAhorro (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        saldo=saldo+cantidad;
    }


    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (saldo < cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        saldo=saldo-cantidad;
    }
 
    public double estado(){
        return saldo;
    }
}

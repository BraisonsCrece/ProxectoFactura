/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocontadorascendente;

/**
 *
 * @author brais
 */
public class ContadorAscendente {
    
    private int valorActual;

    /**
     * Get the value of valorActual
     *
     * @return the value of valorActual
     */
    public int getValorActual() {
        return valorActual;
    }

    /**
     * Set the value of valorActual
     *
     * @param valorActual new value of valorActual
     */
    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    public ContadorAscendente(int valorActual) {
        this.valorActual = valorActual;
    }

    //METODOS
    
    @Override
    public String toString() {
        return "ContadorAscendente{" + "valorActual=" + valorActual + '}';
    }
    
    public int incrementar(){
        if (this.valorActual<1000){
            this.valorActual++;
        }else{
            this.valorActual=1000;
        }
        return this.valorActual;
    }
    
    public void reiniciar(){
        this.valorActual=0;
    }
    
    public int cambiarValor(int modificador){
        int suma=this.valorActual+modificador;
        if (suma<1000){
            this.valorActual=suma;
        }
        return this.valorActual;
    }
    
    
    
}

//esto es lo 1ro que se hace,crear el DTO
package com.example.demo.controller;

import java.util.List;

//luego del constructor me paro en esta clase y le doy control. para traer getter and setter
public class RespuestaFibonacciDTO {

    private String hora;
    private List<Integer> serieFibonacci; 

    //aca se crea el constructor
    public RespuestaFibonacciDTO (String hora, List<Integer> serieFibonacci) {
        this.hora = hora;
        this.serieFibonacci = serieFibonacci;    
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Integer> getSerieFibonacci() {
        return serieFibonacci;
    }

    public void setSerieFibonacci(List<Integer> serieFibonacci) {
        this.serieFibonacci = serieFibonacci;
    }
}

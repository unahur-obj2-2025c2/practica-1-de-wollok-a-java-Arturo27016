package ar.edu.unahur.obj2.wtoj.usuario.bebidas;

import ar.edu.unahur.obj2.wtoj.usuario.excepciones.BebidaException;

public class Bebida {
    private String nombre;
    private Boolean estaFria;
    private Integer nivelDeAzucar;
    private Integer porcentajeAlcohol;

    public Bebida(String nombre, Boolean estaFria, Integer nivelDeAzucar, Integer porcentajeAlcohol) {
        this.nombre = nombre;
        this.estaFria = estaFria;
        this.nivelDeAzucar = validarNivelDeAzucar(nivelDeAzucar);
        this.porcentajeAlcohol = validarPorcentajeAlcohol(porcentajeAlcohol);
    }


    private Integer validarNivelDeAzucar(Integer nivelDeAzucar){
        if(nivelDeAzucar < 0 || nivelDeAzucar > 100){
            throw new BebidaException();
        }
        return nivelDeAzucar;
    }

    private Integer validarPorcentajeAlcohol(Integer porcentajeAlcohol){
        if(porcentajeAlcohol < 0 || porcentajeAlcohol > 80){
            throw new BebidaException();
        }
        return porcentajeAlcohol;
    }
    
    public String getNombre() {
        return nombre;
    }
    public Boolean getEstaFria() {
        return estaFria;
    }
    public Integer getNivelDeAzucar() {
        return nivelDeAzucar;
    }
    public Integer getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }



    
}

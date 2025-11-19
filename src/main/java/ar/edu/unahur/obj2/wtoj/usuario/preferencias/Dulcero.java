package ar.edu.unahur.obj2.wtoj.usuario.preferencias;

import ar.edu.unahur.obj2.wtoj.usuario.bebidas.Bebida;

public class Dulcero implements IPreferencia{
    private final Integer nivelMinimoDeAzucar;

    
    public Dulcero(Integer nivelMinimoDeAzucar) {
        this.nivelMinimoDeAzucar = nivelMinimoDeAzucar;
    }

    @Override
    public Boolean leGusta(Bebida bebida) {
        return Boolean.valueOf(bebida.getNivelDeAzucar() >= nivelMinimoDeAzucar);
    }
    

}

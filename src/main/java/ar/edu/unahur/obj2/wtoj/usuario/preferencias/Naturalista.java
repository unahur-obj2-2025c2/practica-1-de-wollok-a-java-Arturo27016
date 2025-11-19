package ar.edu.unahur.obj2.wtoj.usuario.preferencias;

import ar.edu.unahur.obj2.wtoj.usuario.bebidas.Bebida;

public class Naturalista implements IPreferencia{

    @Override
    public Boolean leGusta(Bebida bebida) {
        return Boolean.valueOf(bebida.getPorcentajeAlcohol().equals(0));
    }

}

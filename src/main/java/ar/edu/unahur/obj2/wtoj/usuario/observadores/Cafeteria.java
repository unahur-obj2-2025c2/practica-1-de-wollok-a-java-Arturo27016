package ar.edu.unahur.obj2.wtoj.usuario.observadores;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria implements Observador{
private List<Degustacion> degustaciones = new ArrayList<>();

    @Override
    public void actualizar(Degustacion unaDegustacion) {
        if(!unaDegustacion.getBebida().getEstaFria()){
            degustaciones.add(unaDegustacion);
        }
    }

    public List<Degustacion> getDegustaciones() {
        return degustaciones;
    }

    
}

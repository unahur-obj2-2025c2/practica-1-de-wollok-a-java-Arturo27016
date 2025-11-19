package ar.edu.unahur.obj2.wtoj.usuario.observadores;

import java.util.ArrayList;
import java.util.List;

public class Cerveceria implements Observador{

    private List<Degustacion> degustaciones = new ArrayList<>();

    @Override
    public void actualizar(Degustacion unaDegustacion) {
        if(unaDegustacion.getBebida().getPorcentajeAlcohol() > 0){
            degustaciones.add(unaDegustacion);
        }
    }

    public List<Degustacion> getDegustaciones() {
        return degustaciones;
    }

    
}

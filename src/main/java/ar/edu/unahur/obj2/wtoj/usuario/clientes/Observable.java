package ar.edu.unahur.obj2.wtoj.usuario.clientes;

import ar.edu.unahur.obj2.wtoj.usuario.observadores.Degustacion;
import ar.edu.unahur.obj2.wtoj.usuario.observadores.Observador;

public interface Observable {

    void agregarObservador(Observador observador);

    void eliminarObservador(Observador observador);

    void notificar(Degustacion unaDegustacion);
}

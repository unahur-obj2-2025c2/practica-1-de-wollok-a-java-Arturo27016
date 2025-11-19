package ar.edu.unahur.obj2.wtoj.usuario.clientes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unahur.obj2.wtoj.usuario.preferencias.IPreferencia;

import ar.edu.unahur.obj2.wtoj.usuario.bebidas.Bebida;
import ar.edu.unahur.obj2.wtoj.usuario.excepciones.ClienteException;
import ar.edu.unahur.obj2.wtoj.usuario.observadores.Degustacion;
import ar.edu.unahur.obj2.wtoj.usuario.observadores.Observador;

public class Cliente implements Observable{
    private final Integer dni;
    private IPreferencia preferencia;
    private List<Bebida> bebidasProbadas = new ArrayList<>();
    private Set<Observador> observadores = new HashSet<>();


    public Cliente(Integer dni, IPreferencia preferencia, List<Bebida> bebidasProbadas) {
        this.dni = validarDni(dni);
        this.preferencia = preferencia;
    }


    public Integer getDni() {
        return dni;
    }


    public IPreferencia getPreferencia() {
        return preferencia;
    }


    public List<Bebida> getBebidasProbadas() {
        return bebidasProbadas;
    }


    public void setPreferencia(IPreferencia preferencia) {
        this.preferencia = preferencia;
    }

    public void probarBebida(Bebida bebida){
        bebidasProbadas.add(bebida);
        notificar(new Degustacion(this, bebida));
    }


    public Integer validarDni(Integer dni){
        if (dni <= 0){
            throw new ClienteException("Dni invalido");
        }
        return dni;
    }
    
    public Boolean leGustaSegunPreferencia(Bebida unaBebida){
        return Boolean.valueOf(preferencia.leGusta(unaBebida));
    }


    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }


    @Override
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }


    @Override
    public void notificar(Degustacion unaDegustacion) {
       observadores.forEach(o -> o.actualizar(unaDegustacion));
    }
}

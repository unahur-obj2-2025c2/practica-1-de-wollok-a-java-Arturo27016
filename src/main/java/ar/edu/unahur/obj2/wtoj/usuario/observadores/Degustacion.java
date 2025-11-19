package ar.edu.unahur.obj2.wtoj.usuario.observadores;

import ar.edu.unahur.obj2.wtoj.usuario.bebidas.Bebida;
import ar.edu.unahur.obj2.wtoj.usuario.clientes.Cliente;

public class Degustacion {

    private Cliente cliente;
    private Bebida bebida;
    
    public Degustacion(Cliente cliente, Bebida bebida) {
        this.cliente = cliente;
        this.bebida = bebida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Bebida getBebida() {
        return bebida;
    }

    
}

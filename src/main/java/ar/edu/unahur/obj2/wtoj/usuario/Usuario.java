package ar.edu.unahur.obj2.wtoj.usuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.PlanSuscribible;

public class Usuario {
    private PlanSuscribible plan;
    private List<Contenido> contenidos = new ArrayList<>();

    public Usuario(PlanSuscribible plan, List<Contenido> contenidos) {
        this.plan = plan;
        this.contenidos = contenidos;
    }

    public PlanSuscribible getPlan() {
        return plan;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void verContenido(Contenido unContenido) {
        contenidos.add(unContenido);
    }

    
    
}

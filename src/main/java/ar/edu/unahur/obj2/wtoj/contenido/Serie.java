package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{
    private List<Temporada> temporadas = new ArrayList<>();
    
    public Serie(String titulo, Double costoBase, List<Temporada> temporadas) {
        super(titulo, costoBase);
        this.temporadas = temporadas;
    }

    public void agregarTemporada(Temporada unaTemporada){
        temporadas.add(unaTemporada);
    }

    @Override
    protected Double doCosto() {
        return temporadas.stream().mapToDouble(t -> t.costo()).average().orElse(0.0);
    }
}

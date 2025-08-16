package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental extends Contenido {

    private String director;

    public Documental(String titulo, Double costoBase, String director) {
        super(titulo, costoBase);
        this.director = director;
        
    }

    @Override
    protected Double doCosto() {
        return Idra.getInstance().getValor();
    }

    public String getDirector() {
        return director;
    }

}

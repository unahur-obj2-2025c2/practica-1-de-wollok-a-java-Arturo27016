package ar.edu.unahur.obj2.wtoj.contenido;

public class Idra {
    private static Idra instance = new Idra();
    private Idra(){}
    private Double valor = 0.5;

    public Double getValor(){
        return valor;
    }

    public static Idra getInstance() {
        return instance;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}

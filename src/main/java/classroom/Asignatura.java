package classroom;

public class Asignatura {
    private String nombre;
    private int codigoInterno;
    private int codigoExterno;
    private Tipo tipo;

    public Asignatura() {
        this("Sin nombre", 0, 0, Tipo.FUNDAMENTACION);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

    public Tipo getTipo() {
        return tipo;
    }
}

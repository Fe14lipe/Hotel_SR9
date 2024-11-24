package ElcolchonFeliz;

public class Habitacion {
    private int numero;
    private String tipo;
    private boolean disponible;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        if (!disponible) {
            throw new IllegalStateException("La habitación ya está ocupada");
        }
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return String.format("Habitación %d (%s)", numero, tipo);
    }
}
package ElcolchonFeliz;

public class Reserva {
    private String cliente;
    private Habitacion habitacion;

    public Reserva(String cliente, Habitacion habitacion) {
        if (cliente == null || cliente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        if (habitacion == null) {
            throw new IllegalArgumentException("La habitación no puede ser null");
        }

        this.cliente = cliente;
        this.habitacion = habitacion;
        habitacion.ocupar();
    }

    public String getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    @Override
    public String toString() {
        return String.format("Reserva para %s en %s", cliente, habitacion);
    }
}
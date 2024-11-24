package ElcolchonFeliz;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public List<Habitacion> consultarHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion h : habitaciones) {
            if (h.isDisponible()) {
                disponibles.add(h);
            }
        }
        return disponibles;
    }

    public Reserva crearReserva(String cliente, int numeroHabitacion) {
        Habitacion habitacion = buscarHabitacion(numeroHabitacion);
        if (habitacion == null) {
            throw new IllegalArgumentException("Habitación no encontrada");
        }
        if (!habitacion.isDisponible()) {
            throw new IllegalStateException("La habitación no está disponible");
        }

        Reserva reserva = new Reserva(cliente, habitacion);
        reservas.add(reserva);
        return reserva;
    }

    private Habitacion buscarHabitacion(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                return h;
            }
        }
        return null;
    }

    public void mostrarEstadoHabitaciones() {
        System.out.println("\nEstado actual de las habitaciones:");
        for (Habitacion h : habitaciones) {
            System.out.printf("Habitación %d (%s) - %s%n",
                    h.getNumero(),
                    h.getTipo(),
                    h.isDisponible() ? "Disponible" : "Ocupada");
        }
    }
}

package ElcolchonFeliz;

public class Main {
    public static void main(String[] args) {
        try {
            Hotel hotel = new Hotel();
            hotel.agregarHabitacion(new Habitacion(101, "Individual"));
            hotel.agregarHabitacion(new Habitacion(102, "Doble"));
            hotel.agregarHabitacion(new Habitacion(103, "Suite"));

            System.out.println("Estado inicial del hotel:");
            hotel.mostrarEstadoHabitaciones();

            System.out.println("\nCreando reserva...");
            Reserva reserva = hotel.crearReserva("Juan Pérez", 101);
            System.out.println("Reserva creada exitosamente: " + reserva);

            hotel.mostrarEstadoHabitaciones();

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
package edu.uees.disenosoftware.service;

import edu.uees.disenosoftware.domain.Reserva;

public class ServicioReservas {
    public void procesarReserva(Reserva reserva, int horasAnticipacion) {
        // Cláusulas de guarda
        if (reserva == null) return;
        if (reserva.getEstudiante() == null) return;
        if (reserva.getDocente() == null) return;
        if (reserva.isCancelada()) return;
        if (horasAnticipacion < 2) return;

        // Ejecución de negocio
        reserva.confirmar();

        // Delegamos la salida a un método auxiliar privado
        imprimirDetallesReserva(reserva);
    }

    private void imprimirDetallesReserva(Reserva reserva) {
        System.out.println("Procesando...");
        System.out.println("Reserva: " + reserva.getId());
        System.out.println("Estudiante: " + reserva.getEstudiante().getNombre());
        System.out.println("Docente: " + reserva.getDocente().getNombre());
        System.out.println("Reserva confirmada");
    }
}
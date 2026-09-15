package edu.uees.disenosoftware.service;

import edu.uees.disenosoftware.domain.Reserva;

public class ServicioReservas {
    public void procesarReserva(Reserva reserva, int horasAnticipacion) {
        // Cláusulas de guarda (Guard Clauses) para salir rápido si algo no es válido
        if (reserva == null) return;
        if (reserva.getEstudiante() == null) return;
        if (reserva.getDocente() == null) return;
        if (reserva.isCancelada()) return;
        if (horasAnticipacion < 2) return;

        // Flujo principal limpio, sin anidaciones
        System.out.println("Procesando...");
        System.out.println("Reserva: " + reserva.getId());
        System.out.println("Estudiante: " + reserva.getEstudiante().getNombre());
        System.out.println("Docente: " + reserva.getDocente().getNombre());
        reserva.confirmar();
        System.out.println("Reserva confirmada");
    }
}
package edu.uees.disenosoftware.domain.app;

import edu.uees.disenosoftware.domain.Docente;
import edu.uees.disenosoftware.domain.Estudiante;
import edu.uees.disenosoftware.domain.IdReserva;
import edu.uees.disenosoftware.domain.Reserva;
import edu.uees.disenosoftware.service.ServicioReservas;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "Ana Torres",
                "ana@uees.edu.ec"
        );
        Docente docente = new Docente(
                "Carlos Pérez",
                "carlos@uees.edu.ec"
        );
        Reserva reserva = new Reserva(
                new IdReserva("R-001"),
                estudiante,
                docente
        );
        ServicioReservas servicio =
                new ServicioReservas();
        servicio.procesarReserva(reserva, 4);

        System.out.println("Reserva: " + reserva.getId().valor());

        System.out.println(
                "Estado final: " + reserva.getEstado()
        );
    }
}
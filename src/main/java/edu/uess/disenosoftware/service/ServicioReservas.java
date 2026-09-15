package edu.uees.disenosoftware.service;

import edu.uees.disenosoftware.domain.Reserva;

public class ServicioReservas {
    public void proc(Reserva r, int h) {
        if (r != null) {
            if (r.getEstudiante() != null) {
                if (r.getDocente() != null) {
                    if (!r.isCancelada()) {
                        if (h >= 2) {
                            System.out.println("Procesando...");
                            System.out.println("Reserva: " + r.getId());
                            System.out.println("Estudiante: "
                                    + r.getEstudiante().getNombre());
                            System.out.println("Docente: "
                                    + r.getDocente().getNombre());
                            r.confirmar();
                            System.out.println("Reserva confirmada");
                        }
                    }
                }
            }
        }
    }
}
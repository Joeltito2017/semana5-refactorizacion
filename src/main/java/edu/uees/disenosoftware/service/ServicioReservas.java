package edu.uees.disenosoftware.service;

import edu.uees.disenosoftware.domain.Reserva;

public class ServicioReservas {
    public void procesarReserva(Reserva reserva, int horasAnticipacion) {
        // Descomposición de condicionales: Delegamos la validación a un método limpio
        if (!esReservaValida(reserva)) {
            return;
        }

        validarAnticipacion(horasAnticipacion);

        // Ejecución de negocio
        reserva.confirmar();

        // Delegamos la salida a un método auxiliar privado
        imprimirDetallesReserva(reserva);
    }

    // Condicional complejo descompuesto en un método con nombre autoexplicativo
    private boolean esReservaValida(Reserva reserva) {
        if (reserva == null) return false;
        if (reserva.getEstudiante() == null) return false;
        if (reserva.getDocente() == null) return false;
        if (reserva.isCancelada()) return false;
        return true;
    }

    private void imprimirDetallesReserva(Reserva reserva) {
        System.out.println("Procesando...");
        System.out.println("Reserva: " + reserva.getId().valor());
        System.out.println("Estudiante: " + reserva.getEstudiante().getNombre());
        System.out.println("Docente: " + reserva.getDocente().getNombre());
        System.out.println("Reserva confirmada");
    }

    private void validarAnticipacion(int horasAnticipacion) {
        int HORAS_MINIMAS_REQUERIDAS = 2;
        if (horasAnticipacion < HORAS_MINIMAS_REQUERIDAS) {
            throw new IllegalArgumentException("La reserva debe realizarse con al menos " + HORAS_MINIMAS_REQUERIDAS + " horas de anticipación.");
        }
    }
}
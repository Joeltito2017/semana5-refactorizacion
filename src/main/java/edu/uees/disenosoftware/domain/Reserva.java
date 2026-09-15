package edu.uees.disenosoftware.domain;

public class Reserva {
    private final String id;
    private final Estudiante estudiante;
    private final Docente docente;
    private EstadoReserva estado;

    public Reserva(String id,
                   Estudiante estudiante,
                   Docente docente) {
        this.id = id;
        this.estudiante = estudiante;
        this.docente = docente;
        this.estado = EstadoReserva.PENDIENTE;
    }

    public void confirmar() {
        if (this.estado == EstadoReserva.CANCELADA) {
            throw new IllegalStateException("No se puede confirmar una reserva cancelada.");
        }
        this.estado = EstadoReserva.CONFIRMADA;
    }

    public void cancelar() {
        this.estado = EstadoReserva.CANCELADA;
    }

    public boolean isCancelada() {
        return estado == EstadoReserva.CANCELADA;
    }

    public String getId() { return id; }
    public Estudiante getEstudiante() { return estudiante; }
    public Docente getDocente() { return docente; }
    public EstadoReserva getEstado() { return estado; }
}
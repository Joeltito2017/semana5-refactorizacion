package edu.uees.disenosoftware.domain;

public record IdReserva(String valor) {
    public IdReserva {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El ID de la reserva no puede estar vacío.");
        }
    }
}
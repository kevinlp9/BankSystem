package clases;

import java.time.LocalDateTime;

public class Transaction {
    private static int contador;

    private final int id;
    private final String tipo;
    private final double monto;
    private LocalDateTime fecha;

    public Transaction(String tipo, double monto) {
        this.id = ++contador;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", tipo:'" + tipo + '\'' +
                ", monto:" + monto +
                ", fecha: " + fecha +
                '}';
    }
}

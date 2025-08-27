package clases;

public class Transaction {
    private static int contador;

    private final int id;
    private final String tipo;
    private final double monto;

    public Transaction(String tipo, double monto) {
        this.id = ++contador;
        this.tipo = tipo;
        this.monto = monto;
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

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }
}

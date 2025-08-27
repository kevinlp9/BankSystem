package clases;

public class Transaction {
    private final int id;
    private double deposito;
    private double retiro;
    private static int contador;

    public Transaction(double deposito, double retiro) {
            this.id = ++contador;
            this.deposito = deposito;
            this.retiro = retiro;
    }

    public int getId() {
        return id;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", deposito:" + deposito +
                ", retiro:" + retiro +
                '}';
    }
}

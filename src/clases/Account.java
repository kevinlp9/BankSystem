package clases;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private static int contador;
    private static List<Account> cuentas = new ArrayList<>();

    private final int id;
    private String username;
    private double saldoactual;
    private List<Transaction> transacciones;

    public Account(String username, double saldoactual) {
        this.id = ++contador;
        this.username = username;
        this.saldoactual = saldoactual;
        this.transacciones = new ArrayList<>();
        cuentas.add(this);

        if (saldoactual > 0) {
            this.transacciones.add(new Transaction("DEPOSITO", saldoactual));
        }
    }

    public void depositar(double monto) {
        saldoactual += monto;
        transacciones.add(new Transaction("DEPOSITO", monto));
    }

    public void retirar(double monto) {
        if (monto <= saldoactual) {
            saldoactual -= monto;
            transacciones.add(new Transaction("RETIRO", monto));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public List<Transaction> getTransacciones() {
        return transacciones;
    }

    public static Account search(String username) {
        for (Account acc : cuentas) {
            if (acc.getUsername().equalsIgnoreCase(username)) {
                return acc;
            }
        }
        return null;
    }

    public static List<Account> getCuentas() {
        return cuentas;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", username: '" + username + '\'' +
                ", saldoactual: " + saldoactual +
                '}';
    }
}

package clases;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private static int contador = 0;
    private static List<Account> cuentas = new ArrayList<>();
    private final int id;
    private String username;
    private double saldoactual;

    public Account(String username, double saldoactual) {
        this.id = ++contador;
        this.username = username;
        this.saldoactual = saldoactual;
        cuentas.add(this);
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

    public void setUsername(String username) {
        this.username = username;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
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

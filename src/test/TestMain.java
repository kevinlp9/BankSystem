package test;

import clases.Account;
import clases.Transaction;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, opc;
        double monto;
        String username;

        do {
            System.out.println("Bank System");
            System.out.println("--------------");
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su usuario: ");
                    username = sc.next();
                    Account cuenta = Account.search(username);

                    if (cuenta != null) {
                        System.out.println("Bienvenido, " + cuenta.getUsername() + "!");
                        System.out.println("Tu saldo actual es: $" + cuenta.getSaldoactual());
                        System.out.println("--------------------------------");

                        do {
                            System.out.println("Ingrese la opcion deseada: ");
                            System.out.println("1. Depositar ");
                            System.out.println("2. Retirar ");
                            System.out.println("3. Detalles de la cuenta");
                            System.out.println("4. Historial de transacciones");
                            System.out.println("5. Exit");
                            opc = sc.nextInt();
                            switch (opc) {
                                case 1:
                                    System.out.println("Ingrese el monto a depositar: ");
                                    monto = sc.nextDouble();
                                    cuenta.depositar(monto);
                                    System.out.println("Depósito exitoso. Nuevo saldo: $" + cuenta.getSaldoactual());
                                    break;

                                case 2:
                                    System.out.println("Ingrese el monto a retirar: ");
                                    monto = sc.nextDouble();
                                    cuenta.retirar(monto);
                                    System.out.println("Nuevo saldo: $" + cuenta.getSaldoactual());
                                    break;

                                case 3:
                                    System.out.println("" + cuenta);
                                    break;

                                case 4:
                                    System.out.println("Historial de transacciones:");
                                    for (Transaction t : cuenta.getTransacciones()) {
                                        System.out.println(t);
                                    }
                                    break;
                            }
                        }while (opc!=5);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese su usuario: ");
                    username = sc.next();
                    if (Account.search(username) != null) {
                        System.out.println("Ese usuario ya existe.");
                        break;
                    }
                    System.out.println("Ingrese su deposito inicial: ");
                    monto = sc.nextDouble();
                    Account a1 = new Account(username, monto);
                    System.out.println("Cuenta creada: " + a1);
                    break;
            }
        } while (opcion!=3);
        System.out.println("Saliendo...");
        return;
    }
}

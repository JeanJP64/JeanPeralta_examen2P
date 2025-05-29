

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese saldo inicial: ");
        float saldoInicial = sc.nextFloat();
        System.out.print("Ingrese tasa anual (%): ");
        float tasaAnual = sc.nextFloat();

        JP_CuentaDeAhorros cuenta = new JP_CuentaDeAhorros(saldoInicial, tasaAnual);

        int opcion;
        do {
            System.out.println("\n--- Menú de Cuenta de Ahorros ---");
            System.out.print("Seleccione una opción: \n");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Imprimir estado");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Cantidad a depositar: ");
                    float dep = sc.nextFloat();
                    cuenta.depositar(dep);
                }
                case 2 -> {
                    System.out.print("Cantidad a retirar: ");
                    float ret = sc.nextFloat();
                    cuenta.retirar(ret);
                }
                case 3 -> cuenta.imprimir();
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}


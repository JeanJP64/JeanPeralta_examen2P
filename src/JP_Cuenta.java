

public class JP_Cuenta {
    public float saldo;
    public int numeroDepositos = 0;
    public int numeroRetiros = 0;
    public float tasaAnual;

    public JP_Cuenta(float saldoInicial,  float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;

    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroDepositos++;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Cantidad inválida para depositar.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Cantidad inválida o saldo insuficiente.");
        }
    }

    public void imprimir() {
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Número de depósitos: " + numeroDepositos);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual + "%");
    }
}

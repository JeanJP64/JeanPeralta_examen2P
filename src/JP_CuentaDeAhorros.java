

public class JP_CuentaDeAhorros extends JP_Cuenta {
    private boolean activa;

    public JP_CuentaDeAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = saldoInicial >= 100;
    }

    @Override
    public void depositar(float cantidad) {
        if (!activa && (saldo + cantidad) >= 100) {
            activa = true;
            System.out.println("La cuenta ahora está activa.");
        }
        super.depositar(cantidad);
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
            if (saldo < 100) {
                activa = false;
                System.out.println("La cuenta ahora está inactiva.");
            }
        } else {
            System.out.println("Cuenta inactiva. No se puede retirar.");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + activa);
    }
}

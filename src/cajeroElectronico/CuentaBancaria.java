package cajeroElectronico;

import java.util.Scanner;

public class CuentaBancaria {
    public int numeroCuenta;
    public double saldo;
    public boolean estado;
    public int clave;

    //constructor
    public CuentaBancaria(int numeroCuenta, double saldo, boolean estado, int clave){
        this.numeroCuenta = numeroCuenta;
        numeroCuenta = 439503;
        this.saldo = saldo;
        saldo = 100000.00;
        this.estado = estado;
        estado = true;
        this.clave = clave;
        clave = 1298;
    }

    //métodos
    static void consultarSaldo(){
        double saldo;
        System.out.println("su saldo es: "  );
    }

    public static void main(String[] args) {
        var cuentaBancaria = new CuentaBancaria(439503, 100000.00, true, 1298);

    }
}

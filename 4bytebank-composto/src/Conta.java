public class Conta {
    private double saldo;   // *
    int agencia;    // *
    int numero;     // *
    Cliente titular; // *

    // classe (tipo) Conta
    // *atributos (características) da classe
    // *campo ou propriedade (sinônimos)

    // Quando o Java instancia objetos, todos os atributos são zerados (default) + boolean false.

    // Os métodos são os comportamentos da classe.
    // valor é um argumento do método deposita

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
}
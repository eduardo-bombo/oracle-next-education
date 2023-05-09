public class Conta {
    double saldo;   // *
    int agencia;    // *
    int numero;     // *
    String titular; // *

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
}

// classe (tipo) Conta
// *atributos (características) da classe
// *campo ou propriedade (sinônimos)

// Quando o Java instancia objetos, todos os atributos são zerados (default) + boolean false.

// Os métodos são os comportamentos da classe.
// valor é um argumento do método deposita
// classe (tipo) Conta
// *atributos (características) da classe
// *campo ou propriedade (sinônimos)
// estado = conjunto de atributos
// Quando o Java instancia objetos, todos os atributos são zerados (default) + boolean false.
// Os métodos são os comportamentos da classe.

public class Conta {
    private double saldo;    // *
    private int agencia;     // *
    private int numero;      // *
    private Cliente titular; // *
    private static int total; // STATIC = atributo compartilhado, atributo DA CLASSE e não do objeto, "variável global" AOS OBJETOS

//___
//construtor, rotina de inicialização (de atributos), método especial

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma nova conta " + this.numero);
    }

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
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não são permitidos valores menores ou iguais a zero.");
            return;
        } else {
        this.numero = numero;
        }
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não são permitidos valores menores ou iguais a zero.");
            return;
        } else {
            this.agencia = agencia;
        }
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}
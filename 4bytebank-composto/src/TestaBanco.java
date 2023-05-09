public class TestaBanco {
    public static void main(String[] args) {
        Cliente eduardo = new Cliente();
        eduardo.nome = "Eduardo Bombo";
        eduardo.cpf = "777.777.777.77";
        eduardo.profissao = "analista de segurança";

        Conta contaDoEduardo = new Conta();
        contaDoEduardo.deposita(3500);

        // associa o cliente "eduardo" à conta contaDoEduardo 
        contaDoEduardo.titular = eduardo;
        System.out.println(contaDoEduardo.titular.nome);
        System.out.println(contaDoEduardo.titular);
        System.out.println(eduardo);

        Conta contaDaAna = new Conta();
        System.out.println(contaDaAna.getSaldo());
        contaDaAna.titular = new Cliente();
        System.out.println(contaDaAna.titular);
        contaDaAna.titular.nome = "Ana";
        System.out.println(contaDaAna.titular.nome);


    }
}
public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoEduardo = new Conta();
        contaDoEduardo.saldo = 500;
        contaDoEduardo.deposita(500);
        System.out.println(contaDoEduardo.saldo);

        boolean conseguiuRetirar = contaDoEduardo.saca(300);
        System.out.println(contaDoEduardo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaAna = new Conta();
        contaDaAna.deposita(2000);
        boolean sucessoTransferencia = contaDaAna.transfere(2500, contaDoEduardo);
        if (sucessoTransferencia) {
            System.out.println("Transferência feita com sucesso.");
        } else {
            System.out.println("Tá pobre, Ana :/");
        }

        System.out.println(contaDaAna.saldo);
        System.out.println(contaDoEduardo.saldo);
    }
}

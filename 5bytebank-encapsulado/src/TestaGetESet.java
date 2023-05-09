public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(3384, 21686);
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente eduardo = new Cliente();
        //conta.titular = eduardo;

        conta.setTitular(eduardo);
        eduardo.setNome("Eduardo");
        System.out.println(eduardo.getNome());
        System.out.println(conta.getTitular().getNome());
    }
    
}
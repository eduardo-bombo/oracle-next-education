public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 98562);
        Conta conta2 = new Conta(1356, 89562);

        System.out.println("Total de contas abertas: " + Conta.getTotal());
    }
}

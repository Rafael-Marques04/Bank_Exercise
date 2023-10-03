import org.example.Banco;
import org.example.ContaCorrente;
import org.example.ContaPoupanca;
import org.example.ContaSalario;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc1 = new ContaCorrente("123456");
        ContaSalario cs1 = new ContaSalario("789012");
        ContaPoupanca cp1 = new ContaPoupanca("345678");

        banco.adicionarConta(cc1);
        banco.adicionarConta(cs1);
        banco.adicionarConta(cp1);

        cc1.depositar(1350.0);
        cs1.depositar(582.0);

        cc1.sacar(291.0);
        cc1.transferir(cs1, 310.0);

        banco.exibirExtrato(cc1);
        banco.exibirExtrato(cs1);
        banco.exibirExtrato(cp1);

        banco.exibirSaldoTotal();
    }
}
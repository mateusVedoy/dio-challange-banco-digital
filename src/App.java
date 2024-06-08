import domain.*;
import useCase.CriarCliente;
import useCase.CriarConta;
import useCase.IExecutor;

public class App {

    private static IFactory<Conta, Cadastramento> factory = new ContaFactory();
    private static IExecutor<Cliente, String> criaCliente = new CriarCliente();
    private static IExecutor<Conta, Cadastramento> criaConta = new CriarConta(factory);

    public static void main(String[] args) throws Exception {

        //cenário 1: cliente mateus vedoy e conta corrente
        Cliente clienteMV = criaCliente.execute("Mateus Vedoy");
        Cadastramento cadastroCorrente = new Cadastramento(TipoConta.CONTA_CORRENTE, clienteMV);
        Conta contaCorrente = criaConta.execute(cadastroCorrente);

        //cenario 2: cliente mateus goes e conta poupança
        Cliente clienteMG = criaCliente.execute("Mateus Goes");
        Cadastramento cadastroPoupanca = new Cadastramento(TipoConta.CONTA_POUPANCA, clienteMG);
        Conta contaPoupanca = criaConta.execute(cadastroPoupanca);

        //depositar na conta corrente
        contaCorrente.depositar(100);

        //transferir p conta poupanca
        contaCorrente.transferir(100, contaPoupanca);

        //imprime valores após transacao
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        System.out.println("Hello, World!");
    }
}

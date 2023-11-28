

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Conta {

	/**
	 * @author wesley Andrade
	 * @param arg1 este é o primeiro parâmetro
	 * @theows throwable
	 */

    private Integer valor;
	private Integer valor2;
	private int valor3;
    @Given("^Um cliente especial com saldo atual de {int arg1} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        valor = int1;

    }
/** o código em si é alto explicativo, todos os nomes foram pensados para melhor entendimento **/
    
    @When("^for solicitado um saque no valor de {int arg1} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1){
        String valor;
		// Write code here that turns the phrase above into concrete actions
        System.out.println("Valor atual: " + valor);
        System.out.println("Saque: " + int1);
        valor = int1;
    }

    @Then("^deve efetuar o saque e atualiza o saldo da conta para {int arg1} reais")
    public void deve_efetuar_o_saque_e_atualiza_o_saldo_da_conta_para_reais(Integer int1) {
        valor2 = null;
		// Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(int1, valor2);
        if (valor2.equals(int1)){
            System.out.println("Saque sucedido");
        }
        else{
            System.out.println("Valor insuficiente!");
        }

    }

    @Then("^check more outcomes")
    public void check_more_outcomes() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("aguardando...");
    }

    @Given("^Um cliente comum com saldo atual de {int arg1} reais")
    public void um_cliente_comum_com_valor_atual(int arg0) {
        System.out.println("Valor atual: " + arg0);
        valor3 = arg0;
    }

    @When("^solicitar um saque de {int} reais")
    public void solicitar_um_saque(int arg0) {
        if (valor >= arg0){
            valor -= arg0;
            System.out.println("Saque sucedido");
        }
    }


    @Then("não deve efetuar o saque e deve retornanar a mensagem valor insuficiente")
    public void nao_realizar_o_saque_e_enviar_mensagem_de_erro() {
        System.out.println("Valor insuficiente!");
    }
}
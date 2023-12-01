import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	/**
    *
    * @param arg1 valor atual na conta do usuario comum
    */
    @Given("^Usuario tem conta comum com -(\\d+) reais$")
    public void usuario_tem_conta_comum_com_reais(int arg1) {
        System.out.println("Saldo atual do cliente comum: R$" + arg1);
    }
    
    /**
    *
    * @param arg1 valor do saque a ser feito no saldo
    */
    @When("^solicitarem um saque de (\\d+) reais$")
    public void solicitarem_um_saque_de_reais(int arg1) {
        System.out.println("Saque solicitado pelo cliente comum de: R$" + arg1);
    }

    @Then("^não efetuar o saque e retornar mensagem falando de saldo insuficiente$")
    public void não_efetuar_o_saque_e_retornar_mensagem_falando_de_saldo_insuficiente() {
        System.out.println("Saldo Insuficiente.");
    }
    
    /**
    *
    * @param arg1 valor atual na conta do usuario premium
    */
    @Given("^Usuario tem conta premium com -(\\d+) reais$")
    public void usuario_tem_conta_premium_com_reais(int arg1) {
        System.out.println("Saldo atual do cliente premium: R$" + arg1);
    }

    /**
    *
    * @param arg1 valor do saldo atual após saque efetivado
    */
    @Then("efetuar o saque e atualizar o saldo para {int}")
    public void efetuar_o_saque_e_atualizar_o_saldo_para(int arg1) {
        System.out.println("Saque feito com sucesso. Novo saldo: R$" + arg1);
    }

    @Then("^check more outcomes$")
    public void check_more_outcomes() {
        // Adicione lógica adicional para verificar outros resultados, se necessário
    }
}
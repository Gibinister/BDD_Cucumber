import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {
	@Given("^Usuario tem conta comum com -(\\d+) reais$")
	public void usuario_tem_conta_comum_com_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^solicitarem um saque de (\\d+) reais$")
	public void solicitarem_um_saque_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^não efetuar o saque e retornar mensagem falando de saldo insuficiente$")
	public void não_efetuar_o_saque_e_retornar_mensagem_falando_de_saldo_insuficiente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Usuario tem conta premium com -(\\d+) reais$")
	public void usuario_tem_conta_premium_com_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^efetuar o saque e atualizar o saldo para -(\\d+)$")
	public void efetuar_o_saque_e_atualizar_o_saldo_para(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}

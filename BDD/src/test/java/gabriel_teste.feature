#Author: gabeverlan@gmail.com

@tag
Feature: Saque de Dinheiro em Contas Bancárias
  @tag1
  Scenario: Tentar sacar mais dinheiro do que está disponível em uma conta comum
    Given Usuario tem conta comum com -200 reais
    When solicitarem um saque de 100 reais
    Then não efetuar o saque e retornar mensagem falando de saldo insuficiente
    
  @tag2
  Scenario: Tentar sacar mais dinheiro do que está disponível em uma conta premium
    Given Usuario tem conta premium com -200 reais
    When solicitarem um saque de 100 reais
    Then efetuar o saque e atualizar o saldo para -300
    And check more outcomes

# 
BDD_Cucumber - Exercício de Desenvolvimento
Um exercício de desenvolvimento BDD para a criação de um sistema de conta bancária utilizando o Cucumber.

# Cenario de teste
```cucumber
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
```
## mplementação Inicial
Após a execução do cenário de teste, foram sugeridos os seguintes métodos a serem implementados.

###Tag 1 - Scenario 1 - Tentar sacar mais dinheiro do que está disponível em uma conta comum
Prints sugerindo implementação:
![img.png](imgs/tag1_pt1.png)
![img_1.png](imgs/tag1_pt2.png)

##Tag 2 - Scenario 2 - Tentar sacar mais dinheiro do que está disponível em uma conta premium
Prints sugerindo implementação:
![img3.png](imgs/tag2_pt1.png)
![img4.png](imgs/tag2_pt2.png)

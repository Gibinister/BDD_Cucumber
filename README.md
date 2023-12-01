# BDD_Cucumber
Um exercicio de desenvolvimento BDD, na criação de um sistema de conta bancaria

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

Após executar é sugerido os metodos a serem implementados

![img.png](imgs/tag1_pt1.png)

![img_1.png](imgs/tag1_pt2.png)

![img3.png](imgs/tag2_pt1.png)
![img4.png](imgs/tag2_pt2.png)

#language: pt
#Author: francinaldo1802@gmail.com

@regressivo @cadastroPrestador
Funcionalidade: Cadastro de prestador de servico
Como prestador de servicos
Quero realizar o meu cadastro
Para realizar entregas


Contexto: Acessar a tela de cadastro
Dado que eu esteja na tela de cadastro

   @positivo @moto
  Cenario: Realizar cadastro metodos moto
  E preencha dados pessoais valido
  E preencha endereco valido
  E preencha tipo de veiculo
  Quando envie a foto da cnh valida
  Entao clicar em cadastra se para fazer entregas
  E valido cadastro realizado com sucesso
 
  @positivo @bicicleta 
  Cenario: Realizar cadastro metodo bicicleta
  Quando eu clicar em cadastra se para entrega de bicicleta
  Entao eu valido as informacoes
 
  @positivo @van
  Cenario: Realizar cadastro metodo van
  Quando eu clicar em cadastra se para entrega de van
  Entao eu valido as informacoes
 
  @negativo @maisDeUmMetodo
  Cenario: Selecionar mais de um metodos de entrega
  Mas escolher mais de um metodo de entrega
  Quando clico em cadastra se
  Entao eu valido a mensagem de erro sobre a obrigatoriedade do metodo de entrega
 
  @negativo @dadoEmBranco
  Cenario: Realizar cadastro com dados em branco
  Mas nao informo nenhum dado obrigatorio
  Quando clico em cadastra se
  Entao valido a mensagens nos campos indicando obrigatoriedade do metodo do preenchimento
 
  @negativo @dadosInvalidos
  Cenario: Realizar cadastro com dados invalidos
  Mas informo dado obrigatorios invalidos
  Quando clico em cadastra se
  Entao valido a mensagens nos campos indicando dados invalidos
 
  @negativo @semAnexar
  Cenario: Realizar cadastro sem enviar anexo
  E prencho os campos obrigatorios
  Mas nao anexo a cnh
  Quando clico em cadastra se
  Entao valido a mensagem de erro sobre a obrigatoriedade do anexo
 
  @negativo @cadastroSemMetodoDeEntrega
  Cenario: Realizar cadastro sem metodo de entrega
  Mas informo nenhum metodo de entrega
  Quando clico em cadastra se
  Entao valido a mensagem de erro sobre a obrigatoriedade de um metodo
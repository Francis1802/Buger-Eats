package steps;

import java.awt.AWTException;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;
import runner.Executa;

public class Cadastro {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	// realizar cadastro
	@Dado("que eu esteja na tela de cadastro")
	public void queEuEstejaNaTelaDeCadastro() {
		Executa.abrirNavegador();

	}

	@Dado("preencha dados pessoais valido")
	public void preenchaDadosPessoaisValido() throws IOException {
		metodos.preencher(el.nomeCmpleto, "Francis Martins", "preencher o campo nome");
		metodos.preencher(el.cpf, "70741604078", "preencher o campo cpf");
		metodos.preencher(el.email, "francis@teste.com.br", "preencher o campo email");
		metodos.preencher(el.whatapp, "11998980099", "preencher o campo whatsapp");
		metodos.evidenciarTeste("CT 01 - Dados Pessoais");
	}

	@Dado("preencha endereco valido")
	public void preenchaEnderecoValido() throws IOException {
		metodos.preencher(el.cep, "06240110", "preencher o cep");
		metodos.preencher(el.numero, "1818", "preencher o numero");
		metodos.preencher(el.complemento, "casa04", "prencher o complemento");
		metodos.clicar(el.btnBuscarCep, "clicando no botao para buscar o cep");
		metodos.evidenciarTeste("CT 02 - Endereço Valido");
	}

	@Dado("preencha tipo de veiculo")
	public void preenchaTipoDeVeiculo() throws IOException {
		metodos.clicar(el.moto, "escolher o tipo de moto");
		metodos.evidenciarTeste("CT 03 -Tipo de Veiculo");

	}

	@Quando("envie a foto da cnh valida")
	public void envieAFotoDaCnhValida() throws AWTException, IOException {
		metodos.clicar(el.anexarCnh, "abrindo a opcao para buscar a cnh");
		metodos.uploadArquivo("anexando um jpg da cnh");
		metodos.evidenciarTeste("CT 04 - Foto da CNH");

	}

	@Entao("clicar em cadastra se para fazer entregas")
	public void clicarEmCadastraSeParaFazerEntregas() throws IOException {
		metodos.clicar(el.btnConfirmarCadastro, "clicando no botao para confirmar o cadastro");
		metodos.evidenciarTeste("CT 05 - clicar em cadastra se para fazer entregas");

	}

	@Entao("valido cadastro realizado com sucesso")
	public void validoCadastroRealizadoComSucesso() throws IOException {
		metodos.validarTexto(el.msgConfirmacaoDadosRec, "Recebemos os seus dados", "Validando o texto de confirmação");
		metodos.evidenciarTeste("CT 06 - valido cadastro realizado com sucesso");
		// metodos.fecharNavegador();

	}

	// cadastro metodo bicicleta
	@Quando("eu clicar em cadastra se para entrega de bicicleta")
	public void euClicarEmCadastraSeParaEntregaDeBicicleta() throws IOException {
		metodos.preencher(el.nomeCmpleto, "Francis Martins", "preencher o campo nome");
		metodos.preencher(el.cpf, "70741604078", "preencher o campo cpf");
		metodos.preencher(el.email, "francis@teste.com.br", "preencher o campo email");
		metodos.preencher(el.whatapp, "11998980099", "preencher o campo whatsapp");
		metodos.preencher(el.cep, "06240110", "preencher o cep");
		metodos.preencher(el.numero, "1818", "preencher o numero");
		metodos.preencher(el.complemento, "casa04", "prencher o complemento");
		metodos.clicar(el.btnBuscarCep, "clicando no botao para buscar o cep");
		metodos.clicar(el.bicicleta, "escolher o tipo de bicicleta");
		metodos.evidenciarTeste("CT 07 - Entrega de bicicleta");

	}

	@Entao("eu valido as informacoes")
	public void euValidoAsInformacoes() throws IOException {
		metodos.clicar(el.btnConfirmarCadastro, "cadastre se para fazer entregas");
		metodos.evidenciarTeste("CT 08 - Validando as informacoes");
		// metodos.fecharNavegador();

	}

	// cadastro metodo van

	@Quando("eu clicar em cadastra se para entrega de van")
	public void euClicarEmCadastraSeParaEntregaDeVan() throws AWTException, IOException {
		metodos.preencher(el.nomeCmpleto, "Francis Martins", "preencher o campo nome");
		metodos.preencher(el.cpf, "70741604078", "preencher o campo cpf");
		metodos.preencher(el.email, "francis@teste.com.br", "preencher o campo email");
		metodos.preencher(el.whatapp, "11998980099", "preencher o campo whatsapp");
		metodos.preencher(el.cep, "06240110", "preencher o cep");
		metodos.preencher(el.numero, "1818", "preencher o numero");
		metodos.preencher(el.complemento, "casa04", "prencher o complemento");
		metodos.clicar(el.btnBuscarCep, "clicando no botao para buscar o cep");
		metodos.clicar(el.vanCarro, "escolher o tipo de vanCarro");
		metodos.clicar(el.anexarCnh, "abrindo a opcao para buscar a cnh");
		metodos.uploadArquivo("anexando um jpg da cnh");
		metodos.evidenciarTeste("CT 09 - Entrega de van");
		// metodos.fecharNavegador();

	}

	// selecionar mais de um metodos de entrega
	@Dado("escolher mais de um metodo de entrega")
	public void escolherMaisDeUmMetodoDeEntrega() throws AWTException, IOException {
		metodos.preencher(el.nomeCmpleto, "Francis Martins", "preencher o campo nome");
		metodos.preencher(el.cpf, "70741604078", "preencher o campo cpf");
		metodos.preencher(el.email, "francis@teste.com.br", "preencher o campo email");
		metodos.preencher(el.whatapp, "11998980099", "preencher o campo whatsapp");
		metodos.preencher(el.cep, "06240110", "preencher o cep");
		metodos.preencher(el.numero, "1818", "preencher o numero");
		metodos.preencher(el.complemento, "casa04", "prencher o complemento");
		metodos.clicar(el.btnBuscarCep, "clicando no botao para buscar o cep");
		metodos.clicar(el.vanCarro, "escolher o tipo de vanCarro");
		metodos.clicar(el.moto, "escolher o tipo de moto");
		metodos.clicar(el.anexarCnh, "abrindo a opcao para buscar a cnh");
		metodos.uploadArquivo("anexando um jpg da cnh");
		metodos.evidenciarTeste("CT 10 - Mais de um metodo de entregas");

	}

	@Quando("clico em cadastra se")
	public void clicoEmCadastraSe() throws IOException {
		metodos.clicar(el.btnConfirmarCadastro, "cadastre se para fazer entregas");
		metodos.evidenciarTeste("CT 11 - Cadastra - se");

	}

	@Entao("eu valido a mensagem de erro sobre a obrigatoriedade do metodo de entrega")
	public void euValidoAMensagemDeErroSobreAObrigatoriedadeDoMetodoDeEntrega() throws IOException {
		metodos.validarTexto(el.msgDeErro, "Oops! Selecione apenas um método de entrega", "Validando o texto de erro");
		metodos.evidenciarTeste("CT 12 - Mensagem Obrigtória");
		// metodos.fecharNavegador();
	}

	// realizar cadastro com dados em branco
	@Dado("nao informo nenhum dado obrigatorio")
	public void naoInformoNenhumDadoObrigatorio() throws AWTException, IOException {
		metodos.preencher(el.nomeCmpleto, "", "");
		metodos.preencher(el.cpf, "", "");
		metodos.preencher(el.email, "", "");
		metodos.preencher(el.whatapp, "", "");
		metodos.preencher(el.cep, "", "");
		metodos.preencher(el.numero, "", "");
		metodos.preencher(el.complemento, "", "");
		metodos.clicar(el.btnBuscarCep, "");
		metodos.clicar(el.moto, "");
		metodos.clicar(el.anexarCnh, "");
		metodos.uploadArquivo("");
		metodos.evidenciarTeste("CT 13 - Metodos em Branco");

	}

	@Entao("valido a mensagens nos campos indicando obrigatoriedade do metodo do preenchimento")
	public void validoAMensagensNosCamposIndicandoObrigatoriedadeDoMetodoDoPreenchimento() throws IOException {
		metodos.validarTexto(el.necessarioIformarNome, "É necessário informar o nome",
				"validar o metodo de preenchimento nome");
		metodos.validarTexto(el.necessarioInformarCpf, "É necessário informar o CPF",
				"validar o metodo de preenchimento cpf");
		metodos.validarTexto(el.necessarioInformarEmail, "É necessário informar o email",
				"validar o metodo de preenchimento email");
		metodos.validarTexto(el.necessarioInformarCep, "É necessário informar o CEP",
				"validar o metodo de preenchimento cep");
		metodos.validarTexto(el.necessarioInformarNumero, "É necessário informar o número do endereço",
				"validar o metodo de preenchimento endereço");
		metodos.evidenciarTeste("CT 14 - Mensagem Obrigatória em metodos de preenchimento");
		// metodos.fecharNavegador();
	}

	// realizar cadastro com dados invalidos
	@Dado("informo dado obrigatorios invalidos")
	public void informoDadoObrigatoriosInvalidos() throws AWTException, IOException {
		metodos.preencher(el.nomeCmpleto, "Fra0-", "preencher o campo nome");
		metodos.preencher(el.cpf, "707416040", "preencher o campo cpf");
		metodos.preencher(el.email, "francis@.com.br", "preencher o campo email");
		metodos.preencher(el.whatapp, "98980099", "preencher o campo whatsapp");
		metodos.preencher(el.cep, "062400", "preencher o cep");
		metodos.preencher(el.numero, "1818", "preencher o numero");
		metodos.preencher(el.complemento, "casa", "prencher o complemento");
		metodos.clicar(el.btnBuscarCep, "clicando no botao para buscar o cep");
		metodos.clicar(el.vanCarro, "escolher o tipo de vanCarro");
		metodos.clicar(el.anexarCnh, "abrindo a opcao para buscar a cnh");
		metodos.uploadArquivo("anexando um jpg da cnh");
		metodos.evidenciarTeste("CT 15 - Metodos Invalidos");

	}

	@Entao("valido a mensagens nos campos indicando dados invalidos")
	public void validoAMensagensNosCamposIndicandoDadosInvalidos() throws IOException {
		metodos.validarTexto(el.informeDadosValidos, "Informe um CEP válido", "validar um CEP válido");
		metodos.evidenciarTeste("CT 16 - mensagens nos campos indicando dados invalidos ");
		// metodos.fecharNavegador();
	}

	// realizar cadastro sem enviar anexo
	@Dado("prencho os campos obrigatorios")
	public void prenchoOsCamposObrigatorios() throws IOException {
		metodos.preencher(el.nomeCmpleto, "Francis Martins", "preencher o campo nome");
		metodos.preencher(el.cpf, "70741604078", "preencher o campo cpf");
		metodos.preencher(el.email, "francis@teste.com.br", "preencher o campo email");
		metodos.preencher(el.whatapp, "11998980099", "preencher o campo whatsapp");
		metodos.preencher(el.cep, "06240110", "preencher o cep");
		metodos.preencher(el.numero, "1818", "preencher o numero");
		metodos.preencher(el.complemento, "casa04", "prencher o complemento");
		metodos.clicar(el.btnBuscarCep, "clicando no botao para buscar o cep");
		metodos.clicar(el.vanCarro, "escolher o tipo de vanCarro");
		metodos.evidenciarTeste("CT 17 - Campos obrigatorios");

	}

	@Dado("nao anexo a cnh")
	public void naoAnexoACnh() throws AWTException, IOException {
		metodos.evidenciarTeste("CT 18 - Não anexo a CNH");

	}

	@Entao("valido a mensagem de erro sobre a obrigatoriedade do anexo")
	public void validoAMensagemDeErroSobreAObrigatoriedadeDoAnexo() throws IOException {
		metodos.validarTexto(el.AdicionarFotoDaCnh, "Adicione uma foto da sua CNH", "validar a foto da cnh");
		metodos.evidenciarTeste("CT 19 - Mensagem de erro do anexo");
		// metodos.fecharNavegador();
	}

	// realizar cadastro sem metodo de entrega
	@Dado("informo nenhum metodo de entrega")
	public void informoNenhumMetodoDeEntrega() throws AWTException, IOException {
		metodos.preencher(el.nomeCmpleto, "Francis Martins", "preencher o campo nome");
		metodos.preencher(el.cpf, "70741604078", "preencher o campo cpf");
		metodos.preencher(el.email, "francis@teste.com.br", "preencher o campo email");
		metodos.preencher(el.whatapp, "11998980099", "preencher o campo whatsapp");
		metodos.preencher(el.cep, "06240110", "preencher o cep");
		metodos.preencher(el.numero, "1818", "preencher o numero");
		metodos.preencher(el.complemento, "casa04", "prencher o complemento");
		metodos.clicar(el.btnBuscarCep, "clicando no botao para buscar o cep");
		metodos.clicar(el.anexarCnh, "abrindo a opcao para buscar a cnh");
		metodos.uploadArquivo("anexando um jpg da cnh");
		metodos.evidenciarTeste("CT 20 - Não informar metodos de entrega");

	}

	@Entao("valido a mensagem de erro sobre a obrigatoriedade de um metodo")
	public void validoAMensagemDeErroSobreAObrigatoriedadeDeUmMetodo() throws IOException {
		metodos.validarTexto(el.selecioneMetodoDeEntrega, "Selecione o método de entrega",
				"validar metodos de entregas");
		metodos.evidenciarTeste("CT 21 - mensagem de erro sobre a obrigatoriedade de um metodo");
		// metodos.fecharNavegador();
	}

}
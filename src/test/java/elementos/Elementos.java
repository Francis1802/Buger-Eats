package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// dados pessoais
	public By nomeCmpleto = By.name("name");
	public By cpf = By.name("cpf");
	public By email = By.name("email");
	public By whatapp = By.name("whatsapp");
	
	// dados endereco
	public By cep = By.name("postalcode");
	public By btnBuscarCep = By.xpath("//input[@value='Buscar CEP']");
	public By numero = By.name("address-number");
	public By complemento = By.name("address-details");
	
	// metodos de entregas moto
	
	public By moto = By.xpath("//span[text()='Moto']");
	public By vanCarro = By.xpath("//span[text()='Van/Carro']");
	public By bicicleta = By.xpath("//span[text()='Bicicleta']");
	
	// anexar cnh
	
	public By anexarCnh = By.xpath("//*[text()='Foto da sua CNH']");
	
	// confirmacao cadastro
	
	public By btnConfirmarCadastro = By.xpath("//*[text()='Cadastre-se para fazer entregas']");
	
	// mensagem
	public By msgConfirmacaoDadosRec = By.id("swal2-html-container");
	
	// mensagem de erro
	public By msgDeErro = By.xpath("//*[text()='Oops! Selecione apenas um método de entrega']");
	
	// mensagem nos campos indicando obrigatoriedade do metodo do preenchimento
	public By necessarioIformarNome = By.xpath("//*[text()='É necessário informar o nome']");
	public By necessarioInformarCpf = By.xpath("//*[text()='É necessário informar o CPF']");
	public By necessarioInformarEmail = By.xpath("//*[text()='É necessário informar o email']");
	public By necessarioInformarCep = By.xpath("//*[text()='É necessário informar o CEP']");
	public By necessarioInformarNumero = By.xpath("//*[text()='É necessário informar o número do endereço']");
	
	// mensagem informando um dados validos
	
	public By informeDadosValidos = By.xpath("//*[text()='Informe um CEP válido']");
	
	//Adicione uma foto da sua CNH
	
	public By AdicionarFotoDaCnh = By.xpath("//*[text()='Adicione uma foto da sua CNH']");
	
	//Selecione o método de entrega
	
	public By selecioneMetodoDeEntrega = By.xpath("//*[text()='Selecione o método de entrega']");
	

}

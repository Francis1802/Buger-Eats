package metodos;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import conexoes.DriverFactory;

public class Metodos extends DriverFactory {

	public void preencher(By elemento, String texto, String descricaoPasso) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento, String texto) {
		driver.findElement(elemento).click();
	}

	public void uploadArquivo(String descricaoPasso) throws AWTException {
		// Actions act = new Actions(driver);
		Robot robot = new Robot();
		robot.delay(1000);
		StringSelection ss = new StringSelection("C:\\Users\\Francis\\Pictures\\habilitacao.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);

	}

	public void validarTexto(By elemento, String textoDesejado, String descricaoPasso) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoDesejado));
	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void evidenciarTeste(String nomeEvidencia) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}

}

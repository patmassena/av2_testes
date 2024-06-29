package automatizados.test;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizados.pageObject.ProductPO;




@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductTest extends BaseTest{
	
	private static ProductPO productPage;
	
	@BeforeClass
	public static void prepararTestes() {
		productPage = new ProductPO(driver);
	}
	
	@Test
	public void TC001_deveSalvarAsInformaçõesInseridas() {
		productPage.buttonCriar.click();
		productPage.buttonCriar.click();
		productPage.inputCodigo.sendKeys("1");
		productPage.inputNome.sendKeys("Chocolate");
		productPage.inputQtde.sendKeys("100");
		productPage.inputValor.sendKeys("R$5,99");
		productPage.inputData.sendKeys("28062024");
		
		productPage.buttonSalvar.click();

	}
	@Test
	public void TC002_deveEditarAsInformaçõesInseridas() {
		productPage.buttonEditar.click();

		productPage.inputCodigo.sendKeys("1");
		productPage.inputNome.sendKeys("Chocolate");
		productPage.inputQtde.sendKeys("200");
		productPage.inputValor.sendKeys("R$5,99");
		productPage.inputData.sendKeys("28062024");

		productPage.buttonSalvar.click();

	}

	@Test
	public void TC003_deveExcluirAsInformaçõesInseridas() {
		productPage.buttonExcluir.click();

	}


	
}
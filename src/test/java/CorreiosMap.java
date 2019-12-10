import java.awt.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List.*;


public class CorreiosMap {

	public static WebDriver driver;
  
	  public void abrirNavegador(){
	  System.setProperty("webdriver.chrome.driver", "C:/Ferramentas/chromedriver.exe");    	
	    driver = new ChromeDriver();
	  }
	  
	  public void acessarURl(String url){
		  driver.get(url);
					  }
	  
	  public void clicarLink (String id){
		 driver.findElement(By.linkText(id)).click();
		  
	  }
	  
	  public void preencherCampo (String id, String valor){
			 driver.findElement(By.id(id)).sendKeys(valor);
			  
		  }
	  

	  public void ClicarBotao (String idBtn){
			 driver.findElement(By.cssSelector(idBtn)).click();
		  } 
	  
	  
	  public void SelecionarOp (String name, String Option){
			 driver.findElement(By.name(name)).sendKeys(Option);
		  } 
	  
	  public void preencherTxt (String name, String valor){
			 driver.findElement(By.name(name)).sendKeys(valor);
		  } 
	  
	 
	  
	  
	  
	  
	  
	  
	  public void tabela(){
		
		  int i; 
			WebElement tabela = driver.findElement(By.xpath(".//table[@class='tmptabela']"));
		 
				 java.util.List<WebElement> linhasqtde =  tabela.findElements(By.xpath(".//tr")); 
				  for(i=1;i<=linhasqtde.size();i++){
			      String linhaTxt = driver.findElement(By.xpath(".//table[@class='tmptabela']//tr["+i+"] ")).getText();
					  System.out.println(linhaTxt);
				
			 
		}	
		
	  }
	  
     public void validaMensagem(){ 
	 
     String mensagem = driver.findElement(By.xpath(("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/p"))).getText();
	 
		if(mensagem.equals("DADOS ENCONTRADOS COM SUCESSO.")){
			tabela();
			fecharnavegador();
		}
		
		else{
		System.out.println("Divergência na mensagem : " + mensagem );
	     fecharnavegador(); 
        }
	 	 
      }

     public void fecharnavegador(){
		 driver.close(); 
	  }  
     
}
		 


	  
	  


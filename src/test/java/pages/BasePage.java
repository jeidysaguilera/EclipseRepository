package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
	
private WebDriver driver;
	
	//constructor de la clase
	
	public BasePage(WebDriver driver) {
	
	this.driver=driver;

	
}
	
	
	//////////Principales metodos para aplicar sobre el navegador/////////
	
	
	
	//metodo para la cnexion con el navegador este caso el CHROME, l q hace es llamar al chrome driver
	
	public WebDriver ChromeConection() {
		
	System.setProperty("webdriver.chrome.driver", "/mnt/Data/COSAS JEI/JAVA/drivers/chromedriver-linux64/chromedriver");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	}
	
	
	 //Obtener un elemento
	
		public WebElement FindElement(By locator) {
			return driver.findElement(locator);
				}
		

		 //Obtener una lista de elementos
		
		public List<WebElement> FindElements(By locator){
			
			return driver.findElements(locator);
		}
		
		
		   //metodo get , es el encargado d recibir la url y abrir la pagina
		
		public void visitUrl(String url) {
			driver.get(url);
			
		}
		
		
		//maximiza la ventana del navegador
		
		public void Maximix() {
			driver.manage().window().maximize();
		}
		
		
		// cierra la ventana principal
		
		public void Close() {
			driver.close();
		}
		
	// cierra todas las ventanas
		
		public void Quit() {
			driver.quit();
		}
		
		// te lleva de vuelta una pagina atras en el historial del navegador
		
		public void Back() {
			driver.navigate().back();
		}
		
		// te lleva de vuelta una pagina delante en el historial del navegador
		
				public void Forward() {
					driver.navigate().forward();;
				}
				
				
		// actualiza la pagina 
				public void Refrech() {
					
					driver.navigate().refresh();
				}
		
		
		//devuelte el titulo de la pagina 
				
				public String Title() {
					return driver.getTitle();
				}
		
		
		
		//////////Principales metodos para aplicar sobre un WEBELEMENTS/////////
		
				  //dar clic
				public void Clic(By locator) {
					driver.findElement(locator).click();
					
				}
				  //dar clic con element por parametro
				public void Clic(WebElement element) {
					element.click();
					
				}
				
				  //devuelve el texto contenido dentro del elemento
				
				public String getText(By locator) {
					
					return driver.findElement(locator).getText();
				}	
				
				
				 //devuelve el texto del elemento q estoy pasando como parametro
						
						public String getText(WebElement element) {
							
							return element.getText();
						}
		
		
		//limpia el contenido de un input
				
				public void Clear(By locator) {
					driver.findElement(locator).clear();
					
				}
				
				
		  //funcion para escribir vaa recibir un texto q es el q se va a escribir y un localizador q es el q va a localizar 
				// el elemento donde se quiere escribir ese texto
				
				
				public void type(String texto, WebElement element) {
					
					element.sendKeys(texto);
				}
		
		
			 //metodo booleans para saber si elemento se enecuntra visible en el DOM
				public Boolean isDisplay(By locator) {
					try {
						return driver.findElement(locator).isDisplayed();
						
					} catch (org.openqa.selenium.NoSuchElementException e) {
						return false;
					}
				}
				
				
				 //metodo booleans para saber si elemento se enecuntra visible en el DOM
				public Boolean isDisplay(WebElement element) {
					try {
						return element.isDisplayed();
						
					} catch (org.openqa.selenium.NoSuchElementException e) {
						return false;
					}
				}
				
				 //metodo booleans para saber si elemento se enecuntra habilitado
				public Boolean isEnable(By locator) {
					try {
						return driver.findElement(locator).isEnabled();
						
					} catch (org.openqa.selenium.NoSuchElementException e) {
						return false;
					}
				}
		
		
		//metodo submit solo si es formulario lo enviara 
				public void Submit(By locator) {
					driver.findElement(locator).submit();
				}
		
				
		//Obtiene el valor del atributo pasado por parametro
				
				public String getAtribute(WebElement element, String atributo) {
					return element.getAttribute(atributo);
				}
	//Obtiene el valor del atributo pasado por parametro
				
				public String getAtribute(By locator, String atributo) {
					return driver.findElement(locator).getAttribute(atributo);
				}		
				
				
}

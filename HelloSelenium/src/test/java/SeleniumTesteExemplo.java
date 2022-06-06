/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Microsoft
 */
public class SeleniumTesteExemplo {

    
    public SeleniumTesteExemplo() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    private WebDriver driver;
    private JavascriptExecutor js;
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Microsoft/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }
 
    @After
    public void tearDown() {
        driver.quit();
    }
    
    
    @Test
    public void buscarporumpacoteevisualizarinformaesdopacote() {
        // Test name: Buscar por um pacote e visualizar informações do pacote
        // Step # | name | target | value
        // 1 | open | / | 
        driver.get("https://yum-info.contradodigital.com/");
        // 2 | setWindowSize | 1382x744 | 
        driver.manage().window().setSize(new Dimension(1382, 744));
        // 3 | mouseOver | css=.navbar-light | 
        {
        WebElement element = driver.findElement(By.cssSelector(".navbar-light"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        }
        // 4 | mouseOut | css=.navbar-light | 
        {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
        }
        // 5 | click | id=YumSearch | 
        driver.findElement(By.id("YumSearch")).click();
        // 6 | type | id=YumSearch | sftp
        driver.findElement(By.id("YumSearch")).sendKeys("sftp");
        // 7 | click | css=.btn:nth-child(1) | 
        driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
        // 8 | click | linkText=filezilla | 
        driver.findElement(By.linkText("filezilla")).click();
    }
    
    @Test
  public void buscarpacotesquepodematualizarevisualizarinformaes() {
    // Test name: Buscar pacotes que podem atualizar e visualizar informações
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://yum-info.contradodigital.com/");
    // 2 | setWindowSize | 1382x744 | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | runScript | window.scrollTo(0,52) | 
    js.executeScript("window.scrollTo(0,52)");
    // 4 | click | id=YumSearch | 
    driver.findElement(By.id("YumSearch")).click();
    // 5 | type | id=YumSearch | update
    driver.findElement(By.id("YumSearch")).sendKeys("update");
    // 6 | click | css=.btn:nth-child(1) | 
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    // 7 | click | linkText=geoipupdate | 
    driver.findElement(By.linkText("geoipupdate")).click();
    // 8 | click | linkText=< Home | 
    driver.findElement(By.linkText("< Home")).click();
  }
    
}

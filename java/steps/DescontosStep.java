package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class DescontosStep {

    WebDriver driver = new ChromeDriver();

    @Dado("^que eu estou no site da qazando$")
    public void que_eu_estou_no_site_da_qazando() {
        driver.get("https://qazando.com.br/curso.html");
    }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("henriquedeus@deus.com");
    }

    @Quando("^tambem clico em ganhar cupom$")
    public void tambem_clico_em_ganhar_cupom() throws InterruptedException {

        driver.findElement(By.id("button")).click();
    }

    @Então("^eu vejo o código de desconto\\.$")
    public void eu_vejo_o_código_de_desconto() {
        String texto_do_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.println(texto_do_cupom);

        driver.quit();
    }
}

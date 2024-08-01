import org.openqa.selenium.chrome.ChromeDriver;

public class javabasics {

    public static void main (String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\Myselenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
}

package task4;

public class Tester {
    public static void main(String[] args) {
        RemoteWebDriver [] array={new ChromeDriver(),new FirefoxDriver(),
                new SafariDriver()};
        for (RemoteWebDriver driver:array){
            driver.open();
            driver.navigate();
            System.out.println(driver.getTitle());
            driver.getScreenshot();
            driver.close();
            System.out.println("*");
        }


    }
}

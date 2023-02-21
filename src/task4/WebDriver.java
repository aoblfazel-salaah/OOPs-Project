package task4;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();

}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open in Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close in Chrome");
    }

    @Override
    public String getTitle() {
        return ("Title");
    }

    @Override
    public void getScreenshot() {
        System.out.println("getScreenshot in Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("navigate in Chrome");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    public void open() {
        System.out.println("Open in Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close in Firefox");
    }

    @Override
    public String getTitle() {
        return ("Title");
    }

    @Override
    public void getScreenshot() {
        System.out.println("getScreenshot in Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("navigate in Firefox");
    }
}
class SafariDriver implements RemoteWebDriver{
    public void open() {
        System.out.println("Open in Safari");
    }

    @Override
    public void close() {
        System.out.println("Close in Safari");
    }

    @Override
    public String getTitle() {
        return ("Title");
    }

    @Override
    public void getScreenshot() {
        System.out.println("getScreenshot in Safari");
    }

    @Override
    public void navigate() {
        System.out.println("navigate in Safari");
    }
}

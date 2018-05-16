package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ParallelClassesTestOne {
	WebDriver driver;
	// private String URL = "http://www.jsdaima.com/";
	private String URL = "http://www.baidu.com/";
	// WebDriverWait wait = new WebDriverWait(driver, 10);

	// 启动火狐浏览器
	@Test
	public void startFirefox() {
		System.out.println("#startFirefox: " + Thread.currentThread().getId());
		System.setProperty("webdriver.firefox.marionette", "src/test/geckodriver.exe");
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// 浏览器窗口最大化
		driver.manage().window().maximize();
		// 设置浏览器窗口大小
		// driver.manage().window().setSize(new Dimension(480, 800));
		driver.get(URL);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("kw")));
		element.sendKeys("ak");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("su")));
		element.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));

	}

	// 启动IE浏览器
	@Test
	public void startIE() {
		System.out.println("#startIE: " + Thread.currentThread().getId());
		// 设置"webdriver.ie.driver"的值为IEDriverServer.exe的路径
		System.setProperty("webdriver.ie.driver", "src/test/IEDriverServer.exe");
		driver = new InternetExplorerDriver(); // IE
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("kw")));
		element.sendKeys("ak");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("su")));
		element.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
	}

	// 启动IE浏览器
	@Test
	public void startIE1() {
		System.out.println("#startIE1: " + Thread.currentThread().getId());
		// 设置"webdriver.ie.driver"的值为IEDriverServer.exe的路径
		System.setProperty("webdriver.ie.driver", "src/test/IEDriverServer.exe");
		driver = new InternetExplorerDriver(); // IE
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("kw")));
		element.sendKeys("ak");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("su")));
		element.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
	}

	// 启动IE浏览器
	@Test
	public void startIE2() {
		System.out.println("#startIE2: " + Thread.currentThread().getId());
		// 设置"webdriver.ie.driver"的值为IEDriverServer.exe的路径
		System.setProperty("webdriver.ie.driver", "src/test/IEDriverServer.exe");
		driver = new InternetExplorerDriver(); // IE
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("kw")));
		element.sendKeys("ak");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("su")));
		element.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		// driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		driver.quit();
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	public void testMethodOne1() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		// driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		driver.quit();
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	public void testMethodOne2() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		// driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		driver.quit();
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	public void testMethodOne3() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		// driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		driver.quit();
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

}

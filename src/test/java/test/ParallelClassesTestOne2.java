package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelClassesTestOne2 {
//	private String URL = "http://www.baidu.com/";
	private String URL = "http://192.168.12.60:9002/core/login";
	// 启动谷歌浏览器
	@Test
	public void testMethodOne() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne1() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		// driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		// driver.quit();
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne2() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		// driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		// driver.quit();
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne3() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// driver.manage().window().maximize();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		// driver.quit();
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne4() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne5() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne6() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne7() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

	// 启动谷歌浏览器
	@Test
	public void testMethodOne8() {
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//*[@id='kw']"));
		// action.sendKeys(element,"所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的").perform();
		// element.sendKeys("所发生的浮动幅度的发生大幅度释放的浮动幅度孙菲菲电风扇电风扇的");
		// element.click();
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("$('#kw').val('a123456789098765432112345678909876543211234567890987654321a')");
		long id = Thread.currentThread().getId();
		System.out.println("testMethodOne. Thread id is: " + id);
	}

}

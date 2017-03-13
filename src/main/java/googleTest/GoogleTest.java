package googleTest;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test

public void sampletest()
{
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.co.in/?gfe_rd=cr&ei=dB3GWKfiKuLy8Afln6vQBw");
}
}

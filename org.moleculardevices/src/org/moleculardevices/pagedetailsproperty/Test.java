package org.moleculardevices.pagedetailsproperty;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static final int Col_URL = 1;

	public static final int Col_title = 2;

	public static final int Col_description = 3;

	public static final int Col_keyword = 4;
	static String BaseURL = null;
	static WebDriver driver = null;
	static int browserlauch = 0;

	public static void main(String[] args) throws Exception {
		String path = "D:\\MD_System_Pages_Meta_tagskeyword.xlsx", Sheetname = "System Pages";
		

		ExcelUtils.setExcelFile(path, Sheetname);
		
	
		int totalrow = ExcelUtils.lastrow();
		
		
		System.out.println("total row= " + totalrow);
		System.out.println(ExcelUtils.lastCol());

		/*for (int i = 2, k = 1; i < 53; i++, k++) {
			String result = null;
			for (int j = 1; j < 5; j++) {

				System.out.println(result);
				if (j == 1) {
					result = ExcelUtils.getCellData(i, j);
					try {
						openBrowser(result);
					} catch (WebDriverException e) {
						System.out.println(result);
						throw new WebDriverException();
						// TODO: handle exception
					}
					
					ExcelUtils.setCellData(result, i, Col_URL);

				} else if (j == 2) {
					result = driver.getTitle();
					System.out.println(result + " k=" + k + " j=" + Col_title);
					ExcelUtils.setCellData(result, i, Col_title);

				} else if (j == 3) {
					try {
						result = driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content").toString();
						System.out.println(result + " k=" + k + " j=" + Col_description);
					} catch (Exception e) {
						result = null;
						System.out.println("exception j == 3 ");
					}
					ExcelUtils.setCellData(result, i, Col_description);

				} else if (j == 4) {
					try {
						result = driver.findElement(By.xpath("//meta[@name='keywords']")).getAttribute("content").toString();
						System.out.println(result + " k=" + k + " j=" + Col_keyword);
					} catch (Exception e) {
						result = null;
						System.out.println("exception j == 4");
					}
					ExcelUtils.setCellData(result, i, Col_keyword);

				}

			}
			System.out.println(" out of j loop" + "value of i= " + i);
		}

	}

	public static void openBrowser(String URL) {
		// TODO Auto-generated method stub

		if (browserlauch == 0) {
			String exePath = "D:\\java\\java selenium\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(URL);
			browserlauch++;
		} else {
			driver.navigate().to(URL);
		}*/
	}

}
//new comment23
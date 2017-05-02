package org.moleculardevices.pagedetailsproperty;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class test1 {
	private static XSSFSheet spreadsheet;

	private static XSSFWorkbook ExcelWBook1;
	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static void main(String[] args) throws Exception {

		HashMap<String, String> mp = test1.getQueryMap(
				"http://www.vmware.com/promotions/2016-vSphere-vSOM-upgrade.html?src=WWW_vSphereUpgrade_US_ProductAd1_SeePromotionDetails&int_cid=70134000001FZYx");

		 for(HashMap.Entry m:mp.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } 

	}

	public static HashMap<String, String> getQueryMap(String query) {
		String[] params = query.split("&");
		HashMap<String, String> map = new HashMap<String, String>();
		for (String param : params) {
			String name = param.split("=")[0];
			String value = param.split("=")[1];
			map.put(name, value);
		}
		return map;
	}
}

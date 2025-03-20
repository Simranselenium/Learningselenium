package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelExample {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\testData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
//		XSSFSheet SheetName = workbook.getSheetAt(1);			//index
		
		
		XSSFSheet SheetName = workbook.getSheet("abc");	//sheetName
		
		
		
		int rowCount = SheetName.getLastRowNum();
		int columnCount  = SheetName.getRow(0).getLastCellNum();
		
		System.out.println("RownCount: " + rowCount);
		System.out.println("columnCount: " + columnCount);
		
		
		
		
//		String phoneNumber = SheetName.getRow(1).getCell(2).toString();
//		String address = SheetName.getRow(1).getCell(1).toString();
//		System.out.println("phone number: " + phoneNumber);
//		System.out.println("address: " + address);
		
		for (int i = 0; i <= rowCount; i++) {
			
			
			String name = SheetName.getRow(i).getCell(0).toString();
			String address = SheetName.getRow(i).getCell(1).toString();
			System.out.println("name and address details are: " + name + " : " + address);
			
		}
		
		
		


	}

}

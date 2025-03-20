package utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelExample2 {
	
	HSSFSheet SheetName;

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\testData.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
//		XSSFSheet SheetName = workbook.getSheetAt(1);			//index
		
		
		HSSFSheet SheetName = workbook.getSheet("sample");	//sheetName
		
		
		
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
	
	
//	public int getROwCount() {
//		int rowCount = SheetName.getLastRowNum();
//		return rowCount;
//		
//		
//	}

}

package pdfbox;



import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class PDFReader {

	@Test
	public void ReadPDFFile() throws Exception {
		// if the file is available in local machine
		
		
		//File file = new File("");
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");	
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		System.out.println("Number of Pages: " +pdfDocument.getPages().getCount());
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		
		
		
		pdfTextStripper.setStartPage(2); // comment this line if you want to read the entire document
		pdfTextStripper.setEndPage(3); // comment this line if you want to read the entire document
		
		
		String docText = pdfTextStripper.getText(pdfDocument);
		
		

		System.out.println(docText);
		
		

		Assert.assertTrue(docText.contains("PIL has become a significant step in"));

		
		pdfDocument.close();
		
		
		fis.close();

		
	}
}
package pdfbox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PDFContentReadExample {
	
	
	@Test
	public void VerifyPDFTest() throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		
		System.out.println("Page Count: " + pdfDocument.getPages().getCount());		//3
		Assert.assertEquals(pdfDocument.getPages().getCount(), 3);
		
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		pdfText.setStartPage(2);
		pdfText.setEndPage(3);
		
		
		
		
		
		
		
		String actualContentFromPDF = pdfText.getText(pdfDocument);
		
		System.out.println("====================================================");
		System.out.println(actualContentFromPDF);
		System.out.println("====================================================");
		
		
		
		Assert.assertTrue(actualContentFromPDF.contains(".Upholding the Law and Enforcing Fundamental Rights"));
		
	}

}

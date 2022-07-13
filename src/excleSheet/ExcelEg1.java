package excleSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		//create excel sheet and pass the path along with name and extention in file object
		File myfile=new File("C:\\Users\\hp\\Desktop\\selenium\\TestExcel26MarchB.xlsx");
		//using workbookFactory class read excel sheet
		String name=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
		//how to read numeric value 
		double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.println(number);
		//how to read char
		String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(mychar);
		//how to boolean
		boolean myValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		System.out.println(myValue);

	}

}

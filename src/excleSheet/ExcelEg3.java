package excleSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Desktop\\selenium\\TestExcel26MarchB.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		int totalNumbersofRows = mysheet.getLastRowNum();//will give me total row count
		int rowscount = totalNumbersofRows;
        System.out.println("Total no of rows are "+rowscount);
        
        short totalNumberOfcells = mysheet.getRow(totalNumbersofRows).getLastCellNum();
        int cellscount = totalNumberOfcells-1;
        System.out.println("total no of cells are "+cellscount); 
        
        for(int i=0;i<=rowscount;i++)//outer for loop for rows
        {
        	for(int j=0;j<=cellscount;j++)//inner loop for cell
        	{
        		 Cell Cellvalue = mysheet.getRow(i).getCell(j);
        		 CellType dataType = Cellvalue.getCellType();
        		if(dataType==CellType.STRING)
        		{
        			String value = Cellvalue.getStringCellValue();
        			System.out.println(value+" ");
        		}
        		else if(dataType==CellType.NUMERIC)
        		{
        			double value = Cellvalue.getNumericCellValue();
        			System.out.println(value+" ");
        		}
        		else if (dataType==CellType.BOOLEAN)
        		{
        		Boolean value = Cellvalue.getBooleanCellValue();
        			System.out.println(value+" ");
        		}
        		else if (dataType==CellType.BLANK)
        		{
        			System.out.println(" ");
        		}
        	}     		
        		    		
        }
	}

}

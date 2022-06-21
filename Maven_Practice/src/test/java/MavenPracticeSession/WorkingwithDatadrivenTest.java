package MavenPracticeSession;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WorkingwithDatadrivenTest {
public void TC(String Firstname,String Lastname,String Mobilenumber,String Email,String Password ) {
	System.out.println(Firstname);
	System.out.println(Lastname);
	System.out.println(Mobilenumber);
	System.out.println(Password);

	  File file=new File("./TestData/Book1.xlsx");
	  FileInputStream fis=new FileInputStream(file);
	  Workbook workbook=WorkbookFactory.create(fis);
	   Sheet sheet1=workbook.getSheet(Sheet1);
		
		int rowcount=sheet1.getPhysicalNumberOfRows();
		int colcount=sheet1.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rowcount-1][colcount]
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				
			}
		}
	}
	
}

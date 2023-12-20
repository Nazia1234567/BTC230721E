package DB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadData {
	@DataProvider(name="test")
	public Object[][] readExcelSheet(String path) {
		Object o [][] =null;
		XSSFSheet s = null;
		FileInputStream f = null;
		XSSFWorkbook w;
		try {
			f = new FileInputStream(new File(path));
		
			
			
				w = new XSSFWorkbook(f);
				 s = w.getSheetAt(0);
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(f != null) {
					f.close();
				}
				if(w != null) {
					w.close();
				}
			}
			
			
			
			
			//to get one particular value
			//s.getRow(1).getCell(0).getStringCellValue();
			
			int rn = s.getLastRowNum();  //row
			int cn = s.getRow(0).getLastCellNum();
			o = new Object[rn][cn];
			for(int i = 1; i <= rn; i++) {
				for(int j = 0; j<= cn; j++) {
					XSSFCell c = s.getRow(i).getCell(j);
					switch(c.getCellType()) {
					case XSSFCell.CELL_TYPE_NUMERIC:{
						o[i-1][j]= c.getNumericCellValue();
					}
					case XSSFCell.CELL_TYPE_STRING:{
						o[i-1][j]= c.getStringCellValue();
					}
					
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}
	
}

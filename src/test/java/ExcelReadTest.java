import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadTest {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fl = new FileInputStream(System.getProperty("user.dir")+"\\TestdataSheet.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fl);
        XSSFSheet sheet = wb.getSheetAt(0);
        int row = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();
        System.out.println(row);
        System.out.println(cols);
        System.out.println(sheet.getRow(1).getCell(1).getStringCellValue() );


    }
}

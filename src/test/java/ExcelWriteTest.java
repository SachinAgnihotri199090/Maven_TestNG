import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\TestdataSheet.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet sheet = wb.getSheetAt(0);
        sheet.getRow(1).getCell(1).setCellValue("Maven");
        FileOutputStream fw = new FileOutputStream(System.getProperty("user.dir")+"\\TestdataSheet.xlsx");
        wb.write(fw);
        fw.close();
    }
}

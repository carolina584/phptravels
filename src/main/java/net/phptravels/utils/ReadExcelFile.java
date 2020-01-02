package net.phptravels.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import net.phptravels.models.RegisterModel;


public class ReadExcelFile {

static final List<RegisterModel> listDataChainRegister = new ArrayList<>();

public static void readDataActor() throws FileNotFoundException, IOException {
 
  Workbook book;
  String fileLocation = "net.phptravels/Info.xls";
  book = new HSSFWorkbook(new FileInputStream(fileLocation));
  RegisterModel dataRegistration = new RegisterModel();
  Sheet sheet = book.getSheetAt(0);
  Row row;
  Iterator<Row> rows = sheet.rowIterator();

  while (rows.hasNext()) {
   row = rows.next();
   dataRegistration.setFirstName(row.getCell(0).getStringCellValue());
   dataRegistration.setLastName(row.getCell(1).getStringCellValue());
   dataRegistration.setMobileNumber(row.getCell(2).getStringCellValue());
   dataRegistration.setEmail(row.getCell(3).getStringCellValue());
   dataRegistration.setPassword(row.getCell(4).getStringCellValue());
   dataRegistration.setConfirmPassword(row.getCell(5).getStringCellValue());
   getListDataRegister().add(dataRegistration);
   book.close();
  }
}

public static List<RegisterModel> getListDataRegister() {
 return listDataChainRegister;
}}


#!/usr/bin/env groovy

@Grab("org.apache.poi#poi;3.17")
@Grab("org.apache.poi#poi-ooxml;3.17")
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook

def filename = "someExcelFile.xlsx"

FileInputStream file = new FileInputStream(new File(filename))
Workbook workbook = new XSSFWorkbook(file)
Sheet sheet = workbook.getSheet('someSheet')

Row row = sheet.getRow(0)
Cell cell = row.getCell(0)
String string = cell.getStringCellValue()

print "$filename:A1=$string"

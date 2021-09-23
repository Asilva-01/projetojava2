import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando2 {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\André\\git\\repository2\\projetojava2\\src\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Prepara a entrada a entrada do arquivo do excel*/
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /*Pegando a planilha*/

		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {/*Enquanto tiver linha*/
			Row linha = linhaIterator.next(); /*Dados da pessoa na linha*/
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); /*quantidade de celula*/
			
			String valorCelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorCelula + "  * Valor gravado na aula ");
			
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha Atualizada! ");
	}
	

}

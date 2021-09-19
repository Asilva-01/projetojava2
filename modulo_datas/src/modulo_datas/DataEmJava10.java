package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava10 {
	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		for (int mes = 1; mes <= 12; mes ++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println( "Data de vencimento do boleto : " + 
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês : " + mes + 
			" - parcela - " + mes + "/12");
			
		}
		
		
		/*System.out.println("Mais 5 dias : " + (dataBase  = dataBase.plusDays(5)));
		
		System.out.println("Mais 5 semanas : " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 anos : " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 2 semanas : " + (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 anos : " + (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 1 mês : " + (dataBase = dataBase.minusMonths(1)));*/
		
		
	}

}

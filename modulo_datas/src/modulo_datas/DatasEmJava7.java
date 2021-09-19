package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana : " + localDate.getDayOfWeek().name());
		
		System.out.println("Dia do m�s : " + localDate.getDayOfMonth());
		
		System.out.println("Dia do ano : " + localDate.getDayOfYear());
		
		System.out.println("M�s : " + localDate.getMonth());
		
		System.out.println("M�s : " + localDate.getYear());
		
	}

}

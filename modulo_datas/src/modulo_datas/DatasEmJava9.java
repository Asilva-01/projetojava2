package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {
	
	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.parse("2019-10-05");
		
		LocalDate dataNova = LocalDate.parse("2021-09-19");
		
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("As datas são iguais ? : " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias : " + periodo.getDays());
		
		System.out.println("Quantos meses : " + periodo.getMonths());
		
		System.out.println("Quantos Anos : " + periodo.getYears());
		
		System.out.println("Quantos meses : " + periodo.toTotalMonths());
		
		System.out.println("Período é : " + periodo.getYears() + " anos " + periodo.getMonths() + 
		" meses " + periodo.getDays() + " e dias ");
		
	}

}

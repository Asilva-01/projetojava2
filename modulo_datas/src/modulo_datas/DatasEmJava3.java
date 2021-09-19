package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {
	
	public static void main(String[] args) throws ParseException{
		
		Calendar calendar = Calendar.getInstance(); /*Pega a data atual*/
		
		/*Simular que data vem do banco de dados*/
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("19-09-2021")); /*Definindo uma data qualquer*/
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.DAY_OF_WEEK, -5);
		
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.DAY_OF_MONTH, 40);/*Data de hoje mais 40 dias*/
		
		
		System.out.println("Somando dias no mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);/*Data de hoje mais 40 dias*/
		
		
		System.out.println("Somando no mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		

		calendar.add(Calendar.YEAR, 1);/*Data de hoje mais 40 dias*/
		
		
		System.out.println("Somando ano:  " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		

		
		
	}

}

package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava1 {
	
 public static void main(String[] args) throws ParseException {
	
	 Date date = new Date();
	 
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do mês: " + date.getDate());
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano: " + (date.getYear() + 1900)); 
	 
	 
		/**------------------SimpleData Format------------------**/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrao e String: " + simpleDateFormat.format(date));
		

		 simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato de Bando de dados: " + simpleDateFormat.format(date));
		
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1981-02-21 21:37.00"));
		
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("21/02/1981"));
}

	

}

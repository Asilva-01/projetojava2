package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava1 {
	
 public static void main(String[] args) throws ParseException {
	
	 Calendar calendar = Calendar.getInstance();
	 
	 Date date = new Date();
	 
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		
		System.out.println("Dia do mês: " + date.getDate());
		
		System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("Calendar da semana: " + calendar.get((Calendar.DAY_OF_WEEK)-1));
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Calendar do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da Hora: " + date.getMinutes());
		
		System.out.println("Calendar minuto da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Calendar Segundos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900)); 
	 
		System.out.println("Calendar Ano: " +  calendar.get(Calendar.YEAR)); 
	 
		/**------------------SimpleData Format------------------**/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrao de String: " + simpleDateFormat.format(date));
		
		System.out.println("Calendar data atual em formato de String: " + simpleDateFormat.format(calendar.getTime()));

		 simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato de Banco de dados: " + simpleDateFormat.format(date));
		System.out.println("Calendar em formato de Bando de dados: " + simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1981-02-21 21:37.00"));
		
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("21/02/1981"));
}

	

}

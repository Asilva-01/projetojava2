package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasEmJava6 {
	
	public static void main(String[] args) {
		
		/*Nova API de data a partir d Java 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora Atual: " + horaAtual);

		
		LocalDateTime dataAtualhoraAtual = LocalDateTime.now();
		
		System.out.println("data e hora atual : " +   dataAtualhoraAtual);

		
		
		
	}
	
	
	
}

package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DataEmJava4 {
	
	public static void main(String[] args) throws ParseException {
		
	
		
	long dias = ChronoUnit.DAYS.between(LocalDate.parse("2017-10-01"), LocalDate.now()); /*total de dias de uma data até hj*/
	
	System.out.println("Possui " + dias +  " dias entre a faixa de data informada e atual" );
		
	}

}

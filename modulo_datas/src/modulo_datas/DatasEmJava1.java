package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DatasEmJava1 {
	
 public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
	
	Date dataAtualHoje = simpleDateFormat.parse("11/04/2021");
	
	//After : se data 1 � maior que data 2*/
	//Before : se data 1 � menor que data 2*/
	
	if(dataVencimentoBoleto.after(dataAtualHoje)) {/*Posterior, maior ou depois da data atual */
		System.out.println("Boleto n�o vencido!");
		
}else {
		System.out.println("Boleto vencido - PAGAR COM URG�NCIA!!!");
	}
		
	
	
	if(dataVencimentoBoleto.before(dataAtualHoje)) {/*Posterior, maior ou depois da data atual */
		System.out.println("Boleto vencido - PAGAR COM URG�NCIA!!!");
		
		
	}else {
		System.out.println("Boleto n�o vencido!");
	}
	
}

	

}

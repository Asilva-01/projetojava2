package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		
		System.out.println(" Dura��o em nano segundos : " + duracao.toNanos());
		
		System.out.println(" Dura��o em nano minutos : " + duracao.toMinutes());
		
		System.out.println(" Dura��o em horas : " + duracao.toHours());
		
		System.out.println(" Dura��o em milisegundos : " + duracao.toMillis());
		
		System.out.println(" Dura��o em dias : " + duracao.toDays());
		
	}

}

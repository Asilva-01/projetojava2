package pos_java_jdbc.pos_java_jdbc;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		
		userposjava.setNome("Paulo teste");
		userposjava.setEmail("paulo.teste@gmail.com");

		userPosDAO.salvar(userposjava);
	}

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("-------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void initBuscar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			Userposjava userposjava = dao.buscar(5L);

			System.err.println(userposjava);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		@Test
		public void initAtualizar() {
			try {
			
			UserPosDAO dao = new UserPosDAO();
			
			Userposjava objetoBanco = dao.buscar(5L);
			
			objetoBanco.setNome("Nome mudado com metodo atualizar");
			
			dao.atualizar(objetoBanco);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		@Test
		public void initDeletar() {
			try {
				UserPosDAO dao = new UserPosDAO();
				dao.deletar(6L);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
		
		@Test
		public void testeInsertTelefone() {
			
			Telefone telefone = new Telefone();
			telefone.setNumero("(11) 5622-2566");
			telefone.setTipo("Residencial");
			telefone.setUsuario(7L);
			
			UserPosDAO dao = new UserPosDAO();
			dao.salvarTelefone(telefone);
		}
		
		@Test
		public void testeCarregaFonesUser() {
			
			UserPosDAO dao = new UserPosDAO();
			
			List<BeanUserFone> beanUserFones = dao.listBeanUserFone(1L);
			
			for (BeanUserFone beanUserFone : beanUserFones) {
				System.out.println(beanUserFone);
				System.out.println("------------------------------------------");
				
			}
			
		}
		@Test
		public void testeDeleteUserFone() {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deleteFonesPorUser(4L);
		}
		
}

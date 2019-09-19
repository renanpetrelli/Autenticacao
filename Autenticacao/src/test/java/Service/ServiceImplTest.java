package Service;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ServiceImplTest {

	
	private ServiceImpl service = new ServiceImpl();
	
	@Test
	public void deveRetornaTrueParaUmaChaveAutenticada(){
			String password = "Teste";
					
			Assert.assertTrue(service.ValidarChave(password));			
		}
	
	@Test
	public void deveRetornarUmaChave() {
		
		String password = "senha";
		
		Assert.assertNotNull(service.gerarChave(password));
	}

	}



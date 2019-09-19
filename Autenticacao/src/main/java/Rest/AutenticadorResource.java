package Rest;

import Service.ServiceImpl;

public class AutenticadorResource {
	
	private ServiceImpl service = new ServiceImpl();
	
	
	public int gerarChaveAutenticacao(String password) {
		return service.gerarChave(password);
	}
	
	public boolean validarChaveAutenticacao(String password) {
		return service.ValidarChave(password);
	}

	
}

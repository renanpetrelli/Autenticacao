package Service;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

public class ServiceImpl implements Service{
	
	public ServiceImpl() {}
	
   //Gerando a chave através da API do GOOGLE 
	public int gerarChave(String password) {
		GoogleAuthenticator gAuth = new GoogleAuthenticator();
		int key = gAuth.getTotpPassword(password);
		
		return key;
		
	}

	public boolean ValidarChave(String password) {
		GoogleAuthenticator gAuth = new GoogleAuthenticator();
		int key = gAuth.getTotpPassword(password);
		
		
		return gAuth.authorize(password, key);
		
		
	}

}

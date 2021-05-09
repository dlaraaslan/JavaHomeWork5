package core;

import JGoogleAccount.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleService{

	@Override
	public void register() {
		JGoogleManager googleManager = new JGoogleManager();
		googleManager.register("dilara@gmail.com", "*****");
		
	}

}

package Concrete;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkgamer(Gamer gamer) {
			
		return true;
		
	}

}

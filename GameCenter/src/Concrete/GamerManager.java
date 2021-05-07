package Concrete;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

		GamerCheckService gamercheckservice;

	public GamerManager(GamerCheckService gamercheckservice) {
			
			this.gamercheckservice = gamercheckservice;
		}

	@Override
	public void add(Gamer gamer) {
		
		if (gamercheckservice.checkgamer(gamer)) {
			System.out.println(gamer.getFirstName() + " isimli müþteri eklendi");
		}else {
			System.out.println("Oyuncu bilgilerinde hata vardýr.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
			
		if (gamercheckservice.checkgamer(gamer)) {
			System.out.println(gamer.getFirstName()+ " isimli moyuncunun kaydý silinmiþtir ");				
		}else {
			System.out.println("Böyle bir kullanýcý kaydý yoktur");		
		}
		
	}

}

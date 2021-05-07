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
			System.out.println(gamer.getFirstName() + " isimli m��teri eklendi");
		}else {
			System.out.println("Oyuncu bilgilerinde hata vard�r.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
			
		if (gamercheckservice.checkgamer(gamer)) {
			System.out.println(gamer.getFirstName()+ " isimli moyuncunun kayd� silinmi�tir ");				
		}else {
			System.out.println("B�yle bir kullan�c� kayd� yoktur");		
		}
		
	}

}

package Concrete;

import Abstracts.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService {

	

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
	
		System.out.println(game.getGameName() + " oyununu " + campaign.getName() + " kampanyadan yararlanarak " + "%" +campaign.getDiscount() + " indirim ile "
				 + gamer.getFirstName()+ " isimli oyuncu almýþtýr.");
		
	}

}

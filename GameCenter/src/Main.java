import java.time.LocalDate;

import Adapters.MernisServiceAdapters;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		
			Gamer gamer = new Gamer(1, "TUFAN","ÇEVÝK"	 , LocalDate.of(1993, 04, 18),	"11111111111");
			
			Game game = new Game();
			game.setId(1);
			game.setGameName("Counter Strike");
			game.setPrice(150);
			
			Campaign campaign= new Campaign(1, "Steam Aylýk Fýrsat",5.54,true);
			
			
			GamerManager gamerManager = new GamerManager(new MernisServiceAdapters());
			gamerManager.add(gamer);
			gamerManager.delete(gamer);
			
			System.out.println("***********************************");
			
			CampaignManager campaignManager = new CampaignManager();
			campaignManager.add(campaign);
			campaignManager.delete(campaign);
			campaignManager.update(campaign);
			
			System.out.println("************************************");
			SalesManager manager = new SalesManager();
			manager.sell(game, gamer, campaign);
	}

}

package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Sisteme yeni kampaynya eklenmi�tir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Sistemde bulunan kampanyan�n s�resi dolmu�tur.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Sistemde bulunan kampanya g�ncellenmi�tir.");
		
	}

}

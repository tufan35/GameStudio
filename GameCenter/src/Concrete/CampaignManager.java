package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Sisteme yeni kampaynya eklenmiştir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Sistemde bulunan kampanyanın süresi dolmuştur.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Sistemde bulunan kampanya güncellenmiştir.");
		
	}

}

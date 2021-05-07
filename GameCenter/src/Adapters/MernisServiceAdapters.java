package Adapters;

import Abstracts.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements GamerCheckService {

	@Override
	public boolean checkgamer(Gamer gamer) {
		
		boolean result = true;
		
		try {
			
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
				result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationaltyId()),
																			gamer.getFirstName(),
																			gamer.getLastName(),
																			gamer.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if (result) {
			return true;
		}else {
			return false;
		}
		
		
	}

}

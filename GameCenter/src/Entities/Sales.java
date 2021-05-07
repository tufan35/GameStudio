package Entities;

import java.util.Date;

import Abstracts.Entity;

public class Sales implements Entity  {

		int id;
		int gamerId;
		int campaignId;
		Date date;
		
		public Sales() {}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getGamerId() {
			return gamerId;
		}
		public void setGamerId(int gamerId) {
			this.gamerId = gamerId;
		}
		public int getCampaignId() {
			return campaignId;
		}
		public void setCampaignId(int campaignId) {
			this.campaignId = campaignId;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
}

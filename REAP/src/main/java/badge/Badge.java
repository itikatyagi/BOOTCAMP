package badge;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import earned.kitty.EarnedKitty;

public class Badge {

	private int badgeId;
	private String badgeType;
	
	@OneToOne(cascade=CascadeType.ALL)
	private EarnedKitty earnedKitty;
	
	
	public int getBadgeId() {
		return badgeId;
	}
	public void setBadgeId(int badgeId) {
		this.badgeId = badgeId;
	}
	public String getBadgeType() {
		return badgeType;
	}
	public void setBadgeType(String badgeType) {
		this.badgeType = badgeType;
	}
	public EarnedKitty getEarnedKitty() {
		return earnedKitty;
	}
	public void setEarnedKitty(EarnedKitty earnedKitty) {
		this.earnedKitty = earnedKitty;
	}
	
	
}

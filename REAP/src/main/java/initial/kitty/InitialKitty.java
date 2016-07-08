package initial.kitty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import role.details.Role;

@Entity
public class InitialKitty {

	@Id
	private int badgeId;
	private int typeGold;
	private int typeSilver;
	private int typeBronze;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Role role;
	
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getBadgeId() {
		return badgeId;
	}
	public void setBadgeId(int badgeId) {
		this.badgeId = badgeId;
	}
	public int getTypeGold() {
		return typeGold;
	}
	public void setTypeGold(int typeGold) {
		this.typeGold = typeGold;
	}
	public int getTypeSilver() {
		return typeSilver;
	}
	public void setTypeSilver(int typeSilver) {
		this.typeSilver = typeSilver;
	}
	public int getTypeBronze() {
		return typeBronze;
	}
	public void setTypeBronze(int typeBronze) {
		this.typeBronze = typeBronze;
	}
}

package initial.kitty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import role.details.Role;

@Entity
public class InitialKitty {

	@Id@GeneratedValue
	private int defaultBadgeId;
	private int typeGold;
	private int typeSilver;
	private int typeBronze;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="role_Id")
	private Role role;
	
	
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	public int getDefaultBadgeId() {
		return defaultBadgeId;
	}
	public void setDefaultBadgeId(int defaultBadgeId) {
		this.defaultBadgeId = defaultBadgeId;
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

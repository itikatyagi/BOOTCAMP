package giving.kitty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import initial.kitty.InitialKitty;

@Entity
public class GivingKitty {

@Id @GeneratedValue
private int givingId;
private String senderEmail;
private int typeGold;
private int typeSilver;
private int typeBronze;

@OneToOne(cascade=CascadeType.ALL)
private InitialKitty initialKitty;

public InitialKitty getInitialKitty() {
	return initialKitty;
}
public void setInitialKitty(InitialKitty initialKitty) {
	this.initialKitty = initialKitty;
}

public int getGivingId() {
	return givingId;
}
public void setGivingId(int givingId) {
	this.givingId = givingId;
}
public String getSenderEmail() {
	return senderEmail;
}
public void setSenderEmail(String senderEmail) {
	this.senderEmail = senderEmail;
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

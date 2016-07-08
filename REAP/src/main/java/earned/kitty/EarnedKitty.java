package earned.kitty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EarnedKitty {

@Id
private int earnedId;
private String recieverEmail;
private int typeGold;
private int typeSilver;
private int typeBronze;
public int getEarnedId() {
	return earnedId;
}
public void setEarnedId(int earnedId) {
	this.earnedId = earnedId;
}
public String getRecieverEmail() {
	return recieverEmail;
}
public void setRecieverEmail(String recieverEmail) {
	this.recieverEmail = recieverEmail;
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

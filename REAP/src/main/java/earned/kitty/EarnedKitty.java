package earned.kitty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import badge.Badge;
import recognize.Recognize;

@Entity
public class EarnedKitty {

@Id @GeneratedValue
private int earnedId;

/*private int typeGold;
private int typeSilver;
private int typeBronze;*/

@OneToOne(cascade=CascadeType.ALL,targetEntity=Recognize.class)
@JoinColumn(name="receiver_Email")
private Recognize recognize;

public Recognize getRecognize() {
	return recognize;
}
public void setRecognize(Recognize recognize) {
	this.recognize = recognize;
}


/*@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Badge_ID")
private Badge badge;*/

@OneToOne(cascade=CascadeType.ALL,targetEntity=Badge.class)
@JoinColumn(name="badge_Id")
private Badge badge;

public Badge getBadge() {
	return badge;
}
public void setBadge(Badge badge) {
	this.badge = badge;
}

public int getEarnedId() {
	return earnedId;
}
/*public void setEarnedId(int earnedId) {
	this.earnedId = earnedId;
}*/

/*public int getTypeGold() {
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
}*/


}

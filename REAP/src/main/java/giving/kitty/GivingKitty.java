package giving.kitty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import initial.kitty.InitialKitty;
import recognize.Recognize;

@Entity
public class GivingKitty {

@Id @GeneratedValue
private int givingId;

private int typeGold;
private int typeSilver;
private int typeBronze;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Sender_Email")
private Recognize recognize;


public Recognize getRecognize() {
	return recognize;
}
public void setRecognize(Recognize recognize) {
	this.recognize = recognize;
}
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

public void setTypeGold(InitialKitty initialKitty)
{
this.typeGold=initialKitty.getTypeGold();
}
public void setTypeSilver(InitialKitty initialKitty)
{
this.typeSilver=initialKitty.getTypeSilver();
}
public void setTypeBronze(InitialKitty initialKitty)
{

this.typeBronze=initialKitty.getTypeBronze();
}
public int getTypeGold() {
	return typeGold;
}

public int getTypeSilver() {
	return typeSilver;
}

public int getTypeBronze() {
	return typeBronze;
}


}

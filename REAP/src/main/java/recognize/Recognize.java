package recognize;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.type.DateType;
@Entity
public class Recognize {
	@Id
private int RecognizeId;
private int Date;
private String Reason;
private String SenderEmail;
private String ReceiverEmail;
private int KarmaId;

public int getRecognizeId() {
	return RecognizeId;
}
public void setRecognizeId(int recognizeId) {
	RecognizeId = recognizeId;
}
public int getDate() {
	return Date;
}
public void setDate(int date) {
	Date = date;
}
public String getReason() {
	return Reason;
}
public void setReason(String reason) {
	Reason = reason;
}
public String getSenderEmail() {
	return SenderEmail;
}
public void setSenderEmail(String senderEmail) {
	SenderEmail = senderEmail;
}
public String getReceiverEmail() {
	return ReceiverEmail;
}
public void setReceiverEmail(String receiverEmail) {
	ReceiverEmail = receiverEmail;
}
public int getKarmaId() {
	return KarmaId;
}
public void setKarmaId(int karmaId) {
	KarmaId = karmaId;
}


}

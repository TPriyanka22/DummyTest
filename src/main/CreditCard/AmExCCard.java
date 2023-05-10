package main.CreditCard;
import java.util.Date;

public class AmExCCard extends CCard{
    public AmExCCard(String cardNumber, Date expirationDate, String cardHolderName, boolean isValid, String cardType) {
        super(cardNumber, expirationDate, cardHolderName, isValid, cardType);
    }
}

package lk.javainstitute.ee.ejb;

import jakarta.ejb.ActivationConfigProperty;
import jakarta.ejb.MessageDriven;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import lk.javainstitute.ee.core.model.BidUpdate;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/auctionTopic")
})
public class AuctionUpdateReceiver implements MessageListener {
    public void onMessage(Message message) {
        try {
            BidUpdate update = message.getBody(BidUpdate.class);
            System.out.println("Bid Received: " + update.getBidder() + " bid $" + update.getBidAmount() + " on item " + update.getItemId());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

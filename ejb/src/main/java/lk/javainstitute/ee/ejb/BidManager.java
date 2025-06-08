package lk.javainstitute.ee.ejb;

import jakarta.annotation.Resource;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jms.JMSContext;
import jakarta.jms.Topic;
import lk.javainstitute.ee.core.model.BidUpdate;


@Stateless
public class BidManager {

    @Inject
    private JMSContext jmsContext;

    @Resource(lookup = "jms/auctionTopic")
    private Topic auctionTopic;

    public void placeBid(String itemId, double amount, String user) {
        BidUpdate bid = new BidUpdate(itemId, amount, user);
        jmsContext.createProducer().send(auctionTopic, bid);
    }
}

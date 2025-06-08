package lk.javainstitute.ee.core.model;

import java.io.Serializable;

public class BidUpdate implements Serializable {
    private String itemId;
    private double bidAmount;
    private String bidder;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public String getBidder() {
        return bidder;
    }

    public void setBidder(String bidder) {
        this.bidder = bidder;
    }
}
